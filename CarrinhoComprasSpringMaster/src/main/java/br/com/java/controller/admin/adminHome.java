package br.com.java.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class adminHome {
	
	@RequestMapping
	public String adminPage() {
		return "admin";
	}
	@RequestMapping("/produtoInventario")
	public String produtoInventario(Model model) {
		return "produtoInventario";
	}
	@RequestMapping("/cliente")
	public String gestaoClientes(Model model) {
		return "gestaoClientes";
	}
}
