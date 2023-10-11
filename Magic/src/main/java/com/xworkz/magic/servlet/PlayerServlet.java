package com.xworkz.magic.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/player",loadOnStartup = 1)
public class PlayerServlet extends HttpServlet{
	public PlayerServlet() {
		System.out.println("no-arg const in PlayerServlet");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init method in PlayerServlet");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service method in PlayerServlet");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost method in PlayerServlet...");
		String name=req.getParameter("name");
		String sport=req.getParameter("sport");
		String country=req.getParameter("country");
		String jerseyNo=req.getParameter("jerseyNo");
		String age=req.getParameter("age");
		String captainName=req.getParameter("captainName");
		String coachName=req.getParameter("coachName");
		String mother=req.getParameter("mother");
		String father=req.getParameter("father");
		String wife=req.getParameter("wife");
		String dob=req.getParameter("dob");
		String alive=req.getParameter("alive");
		String gender=req.getParameter("gender");
		String married=req.getParameter("married");

		
		
		System.out.println(("Name :" ).concat(name).concat(" ").concat("Sport :" ).concat(sport).concat(" ").concat("Country :" ).concat(country).concat(" ").concat("JerseyNo :" ).concat(jerseyNo).concat(" ").concat("Age :" ).concat(age).concat(" ").concat("CaptainName" ).concat(captainName).concat(" ").concat("CoachName :" ).concat(coachName).concat(" ").concat("Father :" ).concat(father).concat(" ").concat("Mother :" ).concat(mother).concat(" ").concat("Wife :" ).concat(wife).concat(" ").concat("DOB :" ).concat(dob).concat(" ").concat("Alive" ).concat(alive));
		System.out.println("Gender :" +gender);
		System.out.println("Marital Status :" +married);
		req.setAttribute("Name", name);
		req.setAttribute("Sport", sport);
		req.setAttribute("Country", country);
		req.setAttribute("JerseyNo", jerseyNo);
		req.setAttribute("Age", age);
		req.setAttribute("CaptainName", captainName);
		req.setAttribute("CoachName", coachName);
		req.setAttribute("Mother", mother);
		req.setAttribute("Father", father);
		req.setAttribute("Wife", wife);
		req.setAttribute("DOB", dob);
		req.setAttribute("Alive", alive);
		req.setAttribute("Gender", gender);
		req.setAttribute("MaritalStatus", married);
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("PlayerSuccess.jsp");
		dispatcher.forward(req, resp);
	}

}
