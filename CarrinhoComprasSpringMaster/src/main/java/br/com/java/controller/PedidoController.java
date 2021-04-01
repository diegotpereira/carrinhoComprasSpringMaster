package br.com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PedidoController {
	
	@RequestMapping("/pedido/")
	public String criarPedido() {
		return "redirect:/checkout?carrinhoId=";
	}
}
