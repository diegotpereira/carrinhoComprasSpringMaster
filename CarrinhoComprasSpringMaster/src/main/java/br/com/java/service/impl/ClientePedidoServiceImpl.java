package br.com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.dao.ClientePedidoDao;
import br.com.java.model.Carrinho;
import br.com.java.model.CarrinhoItem;
import br.com.java.model.ClientePedido;
import br.com.java.service.CarrinhoService;
import br.com.java.service.ClientePedidoService;

@Service
public class ClientePedidoServiceImpl implements ClientePedidoService {
	
	@Autowired
	private ClientePedidoDao clientePedidoDao;
	
	@Autowired
	private CarrinhoService carrinhoService;

//	@Override
	public void adicionarClientePedido(ClientePedido clientePedido) {
		// TODO Auto-generated method stub
		clientePedidoDao.adicionarClientePedido(clientePedido);
	}

//	@Override
	public double getClientePedidoTotalGeral(int carrinhoId) {
		// TODO Auto-generated method stub
		double totalGeral = 0;
		
		Carrinho carrinho = carrinhoService.getCarrinhoById(carrinhoId);
		List<CarrinhoItem> carrinhoItens = carrinho.getCarrinhoItens();
		
		for (CarrinhoItem item : carrinhoItens) {
			totalGeral += item.getPrecoTotal();
		}
		return totalGeral;
	}

}
