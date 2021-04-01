package br.com.java.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminProduto {
	
	@RequestMapping("/produto/adicionarProduto")
	public String adicionarProduto(Model model) {
		return "adicionarProduto";
	}
	@RequestMapping("/produto/editarProduto")
	public String editarProduto(Model model) {
		return "editarProduto";
	}
}
