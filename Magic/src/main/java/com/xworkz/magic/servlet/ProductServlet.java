package com.xworkz.magic.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/product",loadOnStartup = 1)
public class ProductServlet extends HttpServlet{
	
		
		public ProductServlet() {
			System.out.println("no-args Constructor");
		}
		@Override
		public void init() throws ServletException {
			System.out.println("init method in ProductServlet");
			super.init();
		}
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("service method in ProductServlet");
			super.service(req, resp);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("doPost method in ProductServlet");
			String name=req.getParameter("name");
			String price=req.getParameter("price");
			String type=req.getParameter("type");
			String quantity=req.getParameter("quantity");
			System.out.println(("Name : " ).concat(name).concat(" ").concat("Price : " ).concat(price).concat(" ").concat("Type : " ).concat(type).concat(" ").concat("Quantity : " ).concat(quantity));
			
			req.setAttribute("Name", name);
			req.setAttribute("Price", price);
			req.setAttribute("Type", type);
			req.setAttribute("Quantity", quantity);
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("ProductSuccess.jsp");
			dispatcher.forward(req, resp);
		}
		@Override
		public void destroy() {
		System.out.println("Destroy method in ProductServlet");
		super.destroy();
		}

	}



