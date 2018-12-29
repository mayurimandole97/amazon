package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

public class SessionServlet extends HttpServlet {
	private User user;
    HttpSession session;
	private static final long serialVersionUID = 1L;
       public SessionServlet() {
        super();
       
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String username= request.getParameter("username");
		String password= getInitParameter("password");
		PrintWriter out = response.getWriter();
		out.println("welcome"+username);
		user =new User(username,password);
		HttpSession session = request.getSession();
		session.setAttribute("sessionuser",user);*/
		request.getRequestDispatcher("new.jsp").forward(request, response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
