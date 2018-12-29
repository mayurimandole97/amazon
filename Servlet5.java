package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
      public Servlet5() {
        super();
    
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username= getInitParameter("username");
		String password= getInitParameter("password");
		PrintWriter out = response.getWriter();
		out.println("welcome"+username);
		out.println("<form action='Servlet4' method='post'>");
		out.println("<input type='hidden'name='username'value='"+username+"'/>");
		out.println("<input type='submit' value='submit'/>");
		out.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
