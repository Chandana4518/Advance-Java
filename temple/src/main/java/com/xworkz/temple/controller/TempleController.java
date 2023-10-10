package com.xworkz.temple.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repo.TempleRepository;
import com.xworkz.temple.repo.TempleRepositoryImpl;
import com.xworkz.temple.service.TempleService;
import com.xworkz.temple.service.TempleServiceImpl;

@WebServlet(urlPatterns = { "/save", "/total", "/view" }, loadOnStartup = 1)
public class TempleController extends HttpServlet {
	TempleRepository repository = new TempleRepositoryImpl();
	TempleService service = new TempleServiceImpl(repository);

	public TempleController() {
		System.out.println("Running no args const in TempleController");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init method..");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service method...");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost...");
		String name = req.getParameter("name");
		String place = req.getParameter("place");
		String mainGod = req.getParameter("god");
		String constYear = req.getParameter("year");
		int convertedYear = Integer.parseInt(constYear);
		String constBy = req.getParameter("constBy");

		TempleDTO dto = new TempleDTO(name, place, mainGod, convertedYear, constBy);

		boolean stored = service.validateAndSave(dto);
		System.out.println("Saved :" + stored);
		req.setAttribute("total", this.service.total());
		RequestDispatcher dispatcher = req.getRequestDispatcher("Temple.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet..");
		String uri = req.getRequestURI();
		System.out.println("URI is :" + uri);
		if (uri.endsWith("/total")) {
			req.setAttribute("total", this.service.total());
			req.getRequestDispatcher("Temple.jsp").forward(req, resp);
		} else if (uri.endsWith("/view")) {
			req.setAttribute("view", this.service.getAll());
			req.getRequestDispatcher("TempleView.jsp").forward(req, resp);
		}
	}

}
