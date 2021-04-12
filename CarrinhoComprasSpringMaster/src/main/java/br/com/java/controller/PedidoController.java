package br.com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.java.model.Carrinho;
import br.com.java.model.Cliente;
import br.com.java.model.ClientePedido;
import br.com.java.service.CarrinhoService;
import br.com.java.service.ClientePedidoService;

@Controller
public class PedidoController {
	
	@Autowired
	private CarrinhoService carrinhoService;
	
	@Autowired
	private ClientePedidoService clientePedidoService;
	
	@RequestMapping("/pedido/{ carrinhoId }")
	public String criarPedido(@PathVariable("carrinhoId") int carrinhoId) {
		ClientePedido clientePedido =  new ClientePedido();
		Carrinho carrinho = carrinhoService.getCarrinhoById(carrinhoId);
		clientePedido.setCarrinho(carrinho);
		
		Cliente cliente = carrinho.getCliente();
		clientePedido.setCliente(cliente);
		clientePedido.setEnderecoCobranca(cliente.getEnderecoCobranca());
		clientePedido.setEnderecoEntrega(cliente.getEnderecoEntrega());
		
		clientePedidoService.adicionarClientePedido(clientePedido);
		return "redirect:/checkout?carrinhoId=" + carrinhoId;
	}
}
