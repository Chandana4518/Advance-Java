package com.xworkz.magic.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/vendor",loadOnStartup = 1)
public class VendorServlet extends HttpServlet{
	
	public VendorServlet() {
		System.out.println("no-args const in VendorServlet");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init method in VendorServlet");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service method in VendorServlet");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost method in VendorServlet...");
		String name=req.getParameter("name");
		String gst=req.getParameter("gst");
		String owner=req.getParameter("owner");
		String location=req.getParameter("location");
		System.out.println(("Name :" ).concat(name).concat(" ").concat("GST :" ).concat(gst).concat(" ").concat("Owner :" ).concat(owner).concat(" ").concat("Location :" ).concat(location));
	
	req.setAttribute("Name",name);
	req.setAttribute("GST",gst);
	req.setAttribute("Owner",owner);
	req.setAttribute("Location",location);
	RequestDispatcher dispatcher=req.getRequestDispatcher("VendorSuccess.jsp");
	dispatcher.forward(req, resp);
	}

}
