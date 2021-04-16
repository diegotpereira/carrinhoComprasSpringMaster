package br.com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;

import br.com.java.model.Cliente;
import br.com.java.service.ClienteService;

@Controller
@RequestMapping("/cliente/carrinho")
public class CarrinhoController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping
	public String getCarrinho(@AuthenticationPrincipal User activeUser) {
		Cliente cliente = clienteService.getClientePorUsuarioNome(activeUser.getUsername());
		int carrinhoId = cliente.getCarrinho().getCarrinhoId();
		return "redirect:/cliente/carrinho/" + carrinhoId;
	}
	@RequestMapping("/{carrinhoId}")
	public String getCarrinhoRedirect(@PathVariable (value="carrinhoId")int carrinhoId, Model model) {
		model.addAttribute("carrinhoId", carrinhoId);
		return "carrinho";
	}
}
