package br.com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente/carrinho")
public class CarrinhoController {
	
	@RequestMapping
	public String getCarrinho() {
		return "redirect:/cliente/carrinho/";
	}
	@RequestMapping("/carrinho")
	public String getCarrinhoRedirect(Model model) {
		return "carrinho";
	}
}
