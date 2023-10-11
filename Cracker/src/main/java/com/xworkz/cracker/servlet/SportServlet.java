package com.xworkz.cracker.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/sport",loadOnStartup=1)
public class SportServlet extends HttpServlet{
	
	public SportServlet() {
		System.out.println("............");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("?????????????????");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("PPPPPPPPPPPPPPPPPPPPPp");
		super.service(arg0, arg1);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("_______________________--");
		String gender=req.getParameter("gender");
		System.out.println(gender);
		req.setAttribute("Gender", gender);
		RequestDispatcher dispatcher=req.getRequestDispatcher("SportSuccess.jsp");
		dispatcher.forward(req, resp);
	}

}
