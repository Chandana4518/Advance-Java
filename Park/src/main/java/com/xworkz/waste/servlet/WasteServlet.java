package com.xworkz.waste.servlet;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.waste.dto.WasteDTO;
import com.xworkz.waste.repository.WasteRepository;
import com.xworkz.waste.repository.WasteRepositoryImpl;
import com.xworkz.waste.service.WasteService;
import com.xworkz.waste.service.WasteServiceImpl;

@WebServlet(urlPatterns = "/save",loadOnStartup = 1)
public class WasteServlet extends HttpServlet{
	
	public WasteServlet() {
		System.out.println("No args const in WasteServlet");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init method in WasteServlet");	
		super.init();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doPost method in WasteServlet");
		String name=req.getParameter("name");
		String type=req.getParameter("type");
		String weight=req.getParameter("weight");
		double convertedWeight=Double.parseDouble(weight);
		
		req.setAttribute("Name", name);
		req.setAttribute("Type", type);
		req.setAttribute("ConvertedWeight", convertedWeight);
		WasteDTO wasteDTO=new WasteDTO(name, type, convertedWeight);
		WasteRepository wasteRepository=new WasteRepositoryImpl();
		WasteService wasteService=new WasteServiceImpl(wasteRepository);
		boolean stored=wasteService.validateAndSave(wasteDTO);
		if(stored)
		{
			System.out.println("Saved");
			req.setAttribute("msg", "Data is Saved");
		}
		else {
			System.out.println("Not Saved..");
			req.setAttribute("msg", "Data is not Saved");
		}
		RequestDispatcher dispatcher=req.getRequestDispatcher("WasteSuccess.jsp");
		dispatcher.forward(req, resp);
		}

}
