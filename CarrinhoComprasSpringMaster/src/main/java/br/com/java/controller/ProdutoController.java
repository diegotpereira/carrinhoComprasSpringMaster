package br.com.java.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@RequestMapping("/mostrarProduto/{produtoId}")
	public String viewProduto(@PathVariable int produtoId, Model model) throws IOException{
		Produto produto = produtoService.getProdutoById(produtoId);
		model.addAttribute("produto", produto);
		return "mostrarProduto";
	}
	@RequestMapping("/produtoLista")
	public String getProdutoPorCategoria(@RequestParam (required=false,name="buscarCondicao") String buscarCondicao, Model model) {
		List<Produto> produtos = produtoService.getProdutoLista();
		model.addAttribute("produtos", produtos);
		model.addAttribute("buscarCondicao", buscarCondicao);
		return "produtoLista";
	}
}
