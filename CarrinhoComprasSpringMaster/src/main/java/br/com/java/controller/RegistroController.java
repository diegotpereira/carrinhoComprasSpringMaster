package br.com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistroController {
	@RequestMapping("/registrar")
	public String registrarCliente(Model model) {
		return "registrarCliente";
	}
}
