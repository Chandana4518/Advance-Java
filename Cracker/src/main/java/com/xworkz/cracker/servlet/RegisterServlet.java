package com.xworkz.cracker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Register",loadOnStartup = 1)
public class RegisterServlet extends HttpServlet{
	
	public RegisterServlet() {
	System.out.println("Connected RegisterServlet no-args const..");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init method,to initialize resource classes..");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service method...");
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method..");
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String address=req.getParameter("address");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String zip=req.getParameter("zip");
		System.out.println(("First Name:").concat(firstName).concat(" ").concat("Last Name:").concat(lastName).concat(" ").concat("Email:").concat(email).concat(" ").concat("Password:").concat("XXXX").concat(" ").concat("City:").concat(city).concat(" ").concat("State:").concat(state).concat(" ").concat("Zip:").concat(zip));
	resp.setContentType("text/html");
	PrintWriter printWriter=resp.getWriter();
	printWriter.print("<html>");
	printWriter.print("<head>");
	printWriter.print("<meta charset=\"ISO-8859-1\">\r\n"
			+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
	
	printWriter.print("<title>");
	printWriter.print("Registration Form");
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
			+ "				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n"
			+ "					href=\"index.html\">Home</a></li>\r\n"
			+ "				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n"
			+ "					href=\"Movie.html\">Movie</a></li>\r\n"
			+ "					<li class=\"nav-item\"><a class=\"nav-link active\"\r\n"
			+ "					href=\"Register.html\">Register</a></li>\r\n"
			+ "			</ul>\r\n"
			+ "		</nav>");
	printWriter.print("<h1>Saved successfully</h1>");
	printWriter.print("<br>Enter First Name :" +firstName);
	printWriter.print("<br> Enter Last Name :" +lastName);
	printWriter.print("<br> Enter Email :" +email);
	printWriter.print("<br> Enter Address :" +address);
	printWriter.print("<br> Enter City :" +city);
	printWriter.print("<br> Enter State :" +state);
	printWriter.print("<br> Enter Zipcode :" +zip);
	printWriter.print("<script\r\n"
			+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\"\r\n"
			+ "		integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\"\r\n"
			+ "		crossorigin=\"anonymous\"></script>");
	
	printWriter.print("</body>");
	printWriter.print("</html>");
	
	}
	
	@Override
	public void destroy() {
		System.out.println("Invoking destroy method..");
		super.destroy();
	}

}
