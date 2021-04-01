package br.com.java.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.java.model.Cliente;
import br.com.java.model.EnderecoCobranca;
import br.com.java.model.EnderecoEntrega;
import br.com.java.service.ClienteService;

@Controller
public class RegistroController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping("/registrar")
	public String registrarCliente(Model model) {
		
		Cliente cliente = new Cliente();
		
		EnderecoCobranca enderecoCobranca = new EnderecoCobranca();
		EnderecoEntrega enderecoEntrega = new EnderecoEntrega();
		
		cliente.setEnderecoCobranca(enderecoCobranca);
		cliente.setEnderecoEntrega(enderecoEntrega);
		
		model.addAttribute("cliente", cliente);
		return "registrarCliente";
	}
	@RequestMapping(value = "/registro", method = RequestMethod.POST)
	public String registroClientePost(@Valid @ModelAttribute("cliente") Cliente cliente, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			return "resgitrarCliente";
		}
		
		List<Cliente> clienteLista = clienteService.getTodosClientes();
		
		for (int i = 0; i < clienteLista.size(); i++) {
			if (cliente.getClienteEmail().equals(clienteLista.get(i).getClienteEmail())) {
				model.addAttribute("emailMsg", "E-mail já existe!.");
				
				return "registrarCliente";
			}
			if (cliente.getUsuarionome().equals(clienteLista.get(i).getUsuarionome())) {
				model.addAttribute("usernamMsg", "Usuário já existe!.");
				
				return "registrarCliente";
			}
		}
		cliente.setAtivado(true);
		clienteService.adicionarCliente(cliente);
		
		return "registrarClienteSucesso";
	}
}
