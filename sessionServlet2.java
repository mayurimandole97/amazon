package com.lti.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;



public class sessionServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       HttpSession oldSession;

    public sessionServlet2() {
        super();
          }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		oldSession=request.getSession(false);
		User user=(User)oldSession.getAttribute("sessionuser");
		
		response.getWriter().println("<h2>welcome "+ user.getUsername() +" </h2>");
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
