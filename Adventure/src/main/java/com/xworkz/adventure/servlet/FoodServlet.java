package com.xworkz.adventure.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/food",loadOnStartup = 1)
public class FoodServlet extends HttpServlet{
	
	public FoodServlet() {
		System.out.println("no-args const in FoodServlet");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init method in FoodServlet");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service method in FoodServlet");
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("doPost method in FoodServlet...");
	String name=req.getParameter("name");
	String type=req.getParameter("type");
	String hotelName=req.getParameter("hotelName");
	String price=req.getParameter("price");
	String quantity=req.getParameter("quantity");
	String total=req.getParameter("total");
	System.out.println(("Name :" ).concat(name).concat(" ").concat("Type :" ).concat(type).concat(" ").concat("Hotel Name :" ).concat(hotelName));
	System.out.println(price);
	System.out.println(quantity);
	System.out.println(total);
	
	int converted=Integer.parseInt(price);
	if(converted>500)
	{
		req.setAttribute("Price",converted);
	}
	double convertedQuantity=Double.parseDouble(quantity);
	if(convertedQuantity>5)
	{
		req.setAttribute("Quantity", convertedQuantity);
	}
	double convertedTotal=converted*convertedQuantity;
	req.setAttribute("Total", convertedTotal);
	req.setAttribute("Name", name);
	req.setAttribute("Type", type);
	req.setAttribute("HotelName", hotelName);
	RequestDispatcher dispatcher=req.getRequestDispatcher("FoodSuccess.jsp");
	dispatcher.forward(req, resp);
	}

}
