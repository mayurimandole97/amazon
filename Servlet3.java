package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet3() {
        super();
         }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username= getInitParameter("username");
		String password= getInitParameter("password");
		PrintWriter out = response.getWriter();
		out.println("<a href='Servlet4?username= "+username+"'>Click here</a>");
				}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
