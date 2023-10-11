package com.xworkz.magic.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/airport",loadOnStartup = 1)
public class AirportServlet extends HttpServlet{
	
	public AirportServlet() {
		System.out.println("no-args const in AirportServlet");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("init method in AirportServlet");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("service method in AirportServlet");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost Method in AirportServlet...");
		String name=req.getParameter("name");
		String country=req.getParameter("country");
		String type=req.getParameter("type");
		String city=req.getParameter("city");
		String capacity=req.getParameter("capacity");
		String width=req.getParameter("width");
		String totalTerminal=req.getParameter("totalTerminal");
		String openDate=req.getParameter("openDate");
		String operational=req.getParameter("operational");
	System.out.println(("Name :" ).concat(name).concat(" ").concat("Country :" ).concat(country).concat(" ").concat("Type :" ).concat(type).concat(" ").concat("City :" ).concat(city).concat(" ").concat("Capacity :" ).concat(capacity).concat(" ").concat("Width :" ).concat(width).concat(" ").concat("Total Terminal :" ).concat(totalTerminal).concat(" ").concat(" Open Date :" ).concat(openDate).concat(" ").concat("Operational  :" ).concat(operational));
	req.setAttribute("Name",name);
	req.setAttribute("Country",country);
	req.setAttribute("Type",type);
	req.setAttribute("City",city);
	req.setAttribute("Capacity",capacity);
	req.setAttribute("Width",width);
	req.setAttribute("TotalTerminal",totalTerminal);
	req.setAttribute("OpenDate",openDate);
	req.setAttribute("Operational",operational);
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("AirportSuccess.jsp");
	dispatcher.forward(req, resp);
	}

}
