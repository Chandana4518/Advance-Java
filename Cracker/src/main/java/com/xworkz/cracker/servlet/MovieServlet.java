package com.xworkz.cracker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/call" )
public class MovieServlet extends HttpServlet{
	
	public MovieServlet()
	{
		System.out.println("Running no args Const in MovieServlet");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method");
		String names=req.getParameter("name");
		String lang=req.getParameter("Language");
		String directors=req.getParameter("director");
		String producers=req.getParameter("producer");
		String budgets=req.getParameter("budget");
		String releaseDate=req.getParameter("date");
		System.out.println(names);
		System.out.println(lang);
		System.out.println(directors);
		System.out.println(producers);
		System.out.println(budgets);
		System.out.println(releaseDate);
		
		resp.setContentType("text/html");
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<html>");
		printWriter.print("<head>");
		printWriter.print("<meta charset=\"ISO-8859-1\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		printWriter.print("<title>");
		
		printWriter.print("Response Page...");
		
		printWriter.print("</title>");
		printWriter.print("<link\r\n"
				+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\"\r\n"
				+ "	rel=\"stylesheet\"\r\n"
				+ "	integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\"\r\n"
				+ "	crossorigin=\"anonymous\">");
		printWriter.print("</head>");
		printWriter.print("<body>");
		
		printWriter.print("<nav class=\"navbar bg-primary\" data-bs-theme=\"dark\">\r\n"
				+ "			<ul class=\"nav nav-pills card-header-pills\">\r\n"
				+ "				<li class=\"nav-item\">\r\n"
				+ "				<a class=\"nav-link active\"href=\"index.html\">Home</a></li>\r\n"
				+ "				<li class=\"nav-item\">\r\n"
				+ "				<a class=\"nav-link active\" href=\"Movie.html\">Movie</a>\r\n"
				+ "				</li>\r\n"
				+ "\r\n"
				+ "			</ul>\r\n"
				+ "		</nav>");
		
		printWriter.print("<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "		integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>");
		printWriter.print("<h1>Saved successfully</h1>");
		printWriter.print("<br> Movie Name :" +names);
		printWriter.print("<br> Language :" +lang);
		printWriter.print("<br> Director Name :" +directors);
		printWriter.print("<br> Producer Name :" +producers);
		printWriter.print("<br> Budget :" +budgets);
		printWriter.print("<br> Release Date :" +releaseDate);
		printWriter.print("</body>");
		printWriter.print("</html>");
		
		
		

		
	}

}
