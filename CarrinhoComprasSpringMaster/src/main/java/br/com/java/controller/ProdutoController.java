package br.com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.java.model.Produto;
import br.com.java.service.ProdutoService;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/produtoLista/todos")
	public String getProdutos(Model model) {
		List<Produto> produtos = produtoService.getProdutoLista();
		model.addAttribute("produtos", produtos);
		return "produtoLista";
	}
	@RequestMapping("/mostrarProduto/")
	public String viewProduto(Model model) {
		return "motrarProduto";
	}
	@RequestMapping("/produtoLista")
	public String getProdutoPorCategoria(Model model) {
		return "produtoLista";
	}
}
