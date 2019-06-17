package com.pablomonteserin;


import java.io.IOException;
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
		// TODO Auto-generated method stub
		String pagina = "index.jsp";
		String action = request.getParameter("action");
		UsuarioBO usuarioBO = new UsuarioBO();
		HttpSession session= request.getSession();
		
		if(session.getAttribute("idUsuario") != null) {
			if(action.equals("irAPagina2")) {
				pagina = "/WEB-INF/pagina2.jsp";
			}
		}
		
		
		if(action.equals("loguearse")) {
			String nombre= request.getParameter("nombre");
			String password = request.getParameter("password");
			Usuario u = new Usuario();
			u.setNombre(nombre);
			u.setPassword(password);
			Usuario u2 = usuarioBO.consultaUsuario(u);
			session.setAttribute("idUsuario", u2.getId());
		}else if(action.equals("matarSession")) {
			session.invalidate();
		}
		

		request.getRequestDispatcher(pagina).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
