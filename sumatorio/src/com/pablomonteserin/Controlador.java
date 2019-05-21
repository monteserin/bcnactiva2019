package com.pablomonteserin;

import java.io.IOException;

import javax.servlet.ServletContext;
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
		HttpSession session = request.getSession();
		ServletContext ctx = getServletContext();
		String action = request.getParameter("action");
		
		if(action.equals("sumar")) {
		Integer sessionSuma2 = (Integer) session.getAttribute("sessionSuma");
		if(sessionSuma2 == null) {
			sessionSuma2 = 0;
		}
		
		Integer ctxSuma2 = (Integer) ctx.getAttribute("ctxSuma");
		if(ctxSuma2 == null) {
			ctxSuma2 = 0;
		}
		
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		
		int n1Int = Integer.parseInt(n1);
		int n2Int = Integer.parseInt(n2);
		
		int requestSuma = n1Int + n2Int;
		sessionSuma2 += requestSuma;
		ctxSuma2 += requestSuma;
		request.setAttribute("requestSuma", requestSuma);
		session.setAttribute("sessionSuma", sessionSuma2);
		ctx.setAttribute("ctxSuma", ctxSuma2);
		}else if(action.equals("borrar")) {
			session.invalidate();
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
