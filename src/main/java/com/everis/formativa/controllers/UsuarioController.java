package com.everis.formativa.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.everis.formativa.models.Usuario;
import com.everis.formativa.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	private final UsuarioService us;
	
	public UsuarioController(UsuarioService usuarioService) {
		this.us = usuarioService;
	}
	//con esto permitira ver todos los usuarios ingresados desde el inicio
	@RequestMapping("")
	public String index(@ModelAttribute("usuario") Usuario usuario, Model model) {
		List<Usuario> lista_usuarios = us.findAll();
		model.addAttribute("lista_usuarios", lista_usuarios);
		return "usuario.jsp";
	}
	
	//nos permitira crear un usuario con los datos capturados en un formulario
	@RequestMapping(value="/crear", method = RequestMethod.POST)
	public String crear(@Valid @ModelAttribute("usuario") Usuario usuario) {
		//aun hay que hacer validaciones para que el usuario se considere valido
		us.crearUsuario(usuario);
		return "redirect:/empleado";
	}
	@RequestMapping("/actualizar/{id}")
	public String actualizar(@PathVariable("id") Long id, Model model) {
		Usuario usuario = us.buscarUsuario(id);
		model.addAttribute("usuario", usuario);
		return "";
	}
	//crear, selección, eliminar y actualizar
}
