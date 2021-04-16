package br.com.java.controller.admin;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import br.com.java.model.Produto;
import br.com.java.service.ProdutoService;

@Controller
@RequestMapping("/admin")
public class AdminProduto {
	
	private Path path;
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/produto/adicionarProduto/")
	public String adicionarProduto(Model model) {
		Produto produto = new Produto();
		produto.setProdutoCategoria("instrumento");
		produto.setProdutoCondicao("novo");
		produto.setProdutoStatus("ativo");
		
		model.addAttribute("produto", produto);
		return "adicionarProduto";
	}
	
	@RequestMapping(value = "/produto/adicionarProduto/", method = RequestMethod.POST)
	public String adicionarProdutoPost(@Valid @ModelAttribute("produto") Produto produto, BindingResult result, HttpServletRequest request) {
		if (result.hasErrors()) {
			return "adicionarProduto";
		}
		produtoService.adicionarProduto(produto);
		
		MultipartFile produtoImagem = produto.getProdutoImagem();
		String rootDirectory =  request.getSession().getServletContext().getRealPath("/");
		path = Paths.get(rootDirectory + "/WEB-INF/resources/imagens/" + produto.getProdutoId() + ".png");
		
		if (produtoImagem != null && !produtoImagem.isEmpty()) {
			try {
				produtoImagem.transferTo(new File(path.toString()));
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				throw new RuntimeException("Erro ao salvar produto com imagem!.", e);
			}
		}
		return "redirect:/admin/produtoInventario";
	}
	@RequestMapping("/produto/editarProduto/{id}")
	public String editarProduto(@PathVariable("id") int id, Model model) {
		
		Produto produto = produtoService.getProdutoById(id);
		model.addAttribute("produto", produto);
		return "editarProduto";
	}
	@RequestMapping(value="/produto/editarProduto", method = RequestMethod.POST)
	public String editarProdutoPost(@Valid @ModelAttribute("produto") Produto produto, BindingResult result, HttpServletRequest request) {
		if (result.hasErrors()) {
			
			return "editarProduto";
		}
		
		MultipartFile produtoImagem =  produto.getProdutoImagem();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		path = Paths.get(rootDirectory + "/WEB-INF/resources/imagens" + produto.getProdutoId() + ".png");
		
		if (produtoImagem != null && !produtoImagem.isEmpty()) {
			
			try {
				produtoImagem.transferTo(new File(path.toString()));
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				throw new RuntimeException("Erro ao salvar imagem do produto!.", e);
			}
		}
		produtoService.editarProduto(produto);
		
		return "redirect:/admin/produtoInventario";
	}
	@RequestMapping("/produto/deletarProduto/{id}")
	public String deletarProduto(@PathVariable int id, Model model, HttpServletRequest request) {
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		path = Paths.get(rootDirectory + "/WEB-INF/resources/imagens/" + id + ".png");
		
		if (Files.exists(path)) {
			try {
				Files.delete(path);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		Produto produto = produtoService.getProdutoById(id);
		produtoService.deletarProduto(produto);
		
		return "redirect:/admin/produtoInventario";
	}
}
