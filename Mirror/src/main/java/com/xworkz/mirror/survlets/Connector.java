package com.xworkz.mirror.survlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/Connector.dynamic")
public class Connector extends HttpServlet{

	public Connector()
	{
		System.out.println("Running no args const in Connector");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doGet method...");
	}
	

}
