package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 public Servlet1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String username= getInitParameter("username");
String password= getInitParameter("password");
Cookie cookie1=new Cookie("name",username);
response.addCookie(cookie1);
PrintWriter out = response.getWriter();
out.println("<a href='Servlet2'>Click here</a>");
List<Integer> arl = new ArrayList<>();
arl.set(1,9);
}
protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
	}
}