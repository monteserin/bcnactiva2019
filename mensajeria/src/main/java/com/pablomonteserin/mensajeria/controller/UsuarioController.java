package com.pablomonteserin.mensajeria.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pablomonteserin.mensajeria.persistence.model.Usuario;
import com.pablomonteserin.mensajeria.persistence.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@RequestMapping(path = "/consultaUsuario", method = RequestMethod.GET)
	public ModelAndView consultaUsuario(@ModelAttribute("usuario") Usuario usuario, HttpServletRequest request, ModelMap model) {
		Usuario u = usuarioRepository.findUsuario(usuario.getNombre(), usuario.getPassword());
		String destino = "index";
		if (u != null) {
			
			
			HttpSession session = request.getSession();
			 session.setAttribute("idUsuario", u.getId());
			
			destino = "menu";
		}
		ModelAndView m = new ModelAndView(destino);
		return m;
	}

	@RequestMapping(path = "/escribirMensajes", method = RequestMethod.GET)
	public ModelAndView escribirMensajes(ModelMap model) {
		Iterable<Usuario> usuarios = usuarioRepository.findAll();


		ModelAndView m = new ModelAndView("escribir-mensajes");
		model.addAttribute("usuarios", usuarios);

		return m;
	}
	
	

}
