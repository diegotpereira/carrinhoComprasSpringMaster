package br.com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.java.model.Carrinho;
import br.com.java.model.CarrinhoItem;
import br.com.java.model.Cliente;
import br.com.java.model.Produto;
import br.com.java.service.CarrinhoItemService;
import br.com.java.service.CarrinhoService;
import br.com.java.service.ClienteService;
import br.com.java.service.ProdutoService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;

@Controller
@RequestMapping("/rest/carrinho")
public class CarrinhoResource {
	
	@Autowired
	private CarrinhoService carrinhoService;
	
	@Autowired
	private CarrinhoItemService carrinhoItemService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/{carrinhoId}")
	public @ResponseBody Carrinho getCarrinhoById(@PathVariable(value = "carrinhoId") int carrinhoId) {
		return carrinhoService.getCarrinhoById(carrinhoId);
	}
	@RequestMapping(value = "/adicionar/{produtoId}", method = RequestMethod.PUT)
	@ResponseStatus(value= HttpStatus.NO_CONTENT)
	public void adicionarItem(@PathVariable(value = "produtoId") int produtoId, @AuthenticationPrincipal User activeUser) {
		Cliente cliente = clienteService.getClientePorUsuarioNome(activeUser.getUsername());
		Carrinho carrinho = cliente.getCarrinho();
		Produto produto = produtoService.getProdutoById(produtoId);
		
		List<CarrinhoItem> carrinhoItens = carrinho.getCarrinhoItens();
		
		for (int i = 0; i < carrinhoItens.size(); i++) {
			if (produto.getProdutoId() == carrinhoItens.get(i).getProduto().getProdutoId()) {
				CarrinhoItem carrinhoItem = carrinhoItens.get(i);
				carrinhoItem.setQuantidade(carrinhoItem.getQuantidade() + 1);
				carrinhoItem.setPrecoTotal(produto.getProdutoPreco()*carrinhoItem.getQuantidade());
				carrinhoItemService.adicionarCarrinhoItem(carrinhoItem);
				
				return;
			}
		}
		CarrinhoItem carrinhoItem = new CarrinhoItem();
		carrinhoItem.setProduto(produto);
		carrinhoItem.setQuantidade(1);
		carrinhoItem.setPrecoTotal(produto.getProdutoPreco()*carrinhoItem.getQuantidade());
		carrinhoItem.setCarrinho(carrinho);
		carrinhoItemService.adicionarCarrinhoItem(carrinhoItem);
	}
	@RequestMapping(value = "/remover/{produtoId}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void removerItem(@PathVariable(value = "produtoId") int produtoId) {
		CarrinhoItem carrinhoItem = carrinhoItemService.getCarrionhoItemByProdutoID(produtoId);
		carrinhoItemService.removerCarrinhoItem(carrinhoItem);
	}
	@RequestMapping(value = "/{carrinhoId}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void limparCarrinho(@PathVariable(value = "carrinhoId") int carrinhoId) {
		Carrinho carrinho = carrinhoService.getCarrinhoById(carrinhoId);
		carrinhoItemService.removerTodosItemsCarrinho(carrinho);
	}
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Solicitação ilegal, verifique sua carga útil")
	public void handleClienteErrors (Exception ex) {}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Erro do Servidor Interno")
	public void handleServerErrors(Exception ex) {}
}
