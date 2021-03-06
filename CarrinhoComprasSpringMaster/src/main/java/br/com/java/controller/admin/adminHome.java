package br.com.java.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.java.model.Cliente;
import br.com.java.model.Produto;
import br.com.java.service.ClienteService;
import br.com.java.service.ProdutoService;

@Controller
@RequestMapping("/admin")
public class adminHome {
	
	@Autowired
	private ProdutoService produtoService;
//	
	@Autowired
	private ClienteService clienteService;
//	
	@RequestMapping
	public String adminPage() {
		return "admin";
	}
	@RequestMapping("/produtoInventario")
	public String produtoInventario(Model model) {
		List<Produto> produtos = produtoService.getProdutoLista();
		model.addAttribute("produtos", produtos);
		return "produtoInventario";
	}
	@RequestMapping("/cliente")
	public String gestaoClientes(Model model) {
		
		List<Cliente> clienteLista = clienteService.getTodosClientes();
		model.addAttribute("clienteLista", clienteLista);
		return "gestaoClientes";
	}
}
