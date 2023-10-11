package com.xworkz.builder.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/architect")
public class BuilderServlet extends HttpServlet{
	
	public BuilderServlet()
	{
		System.out.println("Connecting BuilderServlet..");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		{
			System.out.println("doGet Method...");
			String names=req.getParameter("name");
			String msgs=req.getParameter("msg");
			System.out.println(names);
			System.out.println(msgs);
		}
	}

}
