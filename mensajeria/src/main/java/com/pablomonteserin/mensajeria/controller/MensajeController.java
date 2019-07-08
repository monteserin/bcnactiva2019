package com.pablomonteserin.mensajeria.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pablomonteserin.mensajeria.persistence.model.Mensaje;
import com.pablomonteserin.mensajeria.persistence.model.Usuario;
import com.pablomonteserin.mensajeria.persistence.repository.MensajeRepository;

@Controller
public class MensajeController {

	
	@Autowired
	private MensajeRepository mensajeRepository;
	
	
	@RequestMapping(path = "/escribirMensajes2", method = RequestMethod.GET)
	public ModelAndView escribirMensajes2(@ModelAttribute("txt") String txt, HttpServletRequest request, ModelMap model) {

		String [] ids = request.getParameterValues("ids");
		HttpSession session = request.getSession();
		int idUsuario =(int) session.getAttribute("idUsuario");
			
		for(int i = 0; i<ids.length; i++) {
			Mensaje m = new Mensaje();
			m.setMensaje(txt);
			Usuario destinatario = new Usuario();
			destinatario.setId(Integer.parseInt(ids[i]));
			
			Usuario remitente = new Usuario();
			remitente.setId(idUsuario);
			m.setDestinatario(destinatario);
			m.setRemitente(remitente);
			mensajeRepository.save(m);
		}

		ModelAndView m = new ModelAndView("menu");

		return m;
	}
	
	

	@RequestMapping(path = "/verMensajes", method = RequestMethod.GET)
	public ModelAndView verMensajes( HttpServletRequest request, ModelMap model) {

		HttpSession session = request.getSession();
		int idUsuario =(int) session.getAttribute("idUsuario");
			
		List<Mensaje> mensajes = mensajeRepository.getMensajes(idUsuario);

		model.addAttribute("mensajes", mensajes);
		ModelAndView m = new ModelAndView("consultar-mensajes");
		

		return m;
	}
	
}
