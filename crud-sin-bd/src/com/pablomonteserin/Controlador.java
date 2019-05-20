package com.pablomonteserin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		HttpSession session = request.getSession();
		List<Persona> personas = (List<Persona>) session.getAttribute("personas");
		if(personas == null) {
			personas = new ArrayList<Persona>();
		}
		
		
		if(action.equals("alta")) {
			String nombre = request.getParameter("nombre");
			String dni = request.getParameter("dni");
			int edad = Integer.parseInt(request.getParameter("edad"));
			
			Persona p = new Persona(nombre,dni,edad);
			personas.add(p);
		}else if(action.equals("baja")) {
				String dni = request.getParameter("dni");
				Iterator<Persona> it = personas.iterator();
				while(it.hasNext()) {
					Persona p = it.next();
					if(p.getDni().equals(dni)) {
						it.remove();
					}
				}

			}else if(action.equals("modificacion")) {
				String nombre = request.getParameter("nombre");
				String dni = request.getParameter("dni");
				int edad = Integer.parseInt(request.getParameter("edad"));
				
				Iterator<Persona> it = personas.iterator();
				while(it.hasNext()) {
					Persona p = it.next();
					if(p.getDni().equals(dni)) {
						p.setEdad(edad);
						p.setNombre(nombre);
					}
				}

			}
		
		session.setAttribute("personas",personas);
		
		request.getRequestDispatcher("index.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
