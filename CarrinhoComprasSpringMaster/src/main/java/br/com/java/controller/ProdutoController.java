package br.com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
	
	@RequestMapping("/produtoLista/todos")
	public String getProdutos(Model model) {
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
