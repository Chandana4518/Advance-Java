package com.xworkz.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.store.dto.CrackerDTO;
import com.xworkz.store.service.CrackerService;
@Component
@Controller
public class CrackerController {
	@Autowired
	private CrackerService cracker;
	
	public CrackerController() {
		System.out.println("Created Servlet...");
	}
	@RequestMapping(value = "/send",method = RequestMethod.POST)
	public String sendDto(CrackerDTO dto,Model model)
	{
		System.out.println("Method working...");
	boolean isValid=cracker.validate(dto, model);
	if(isValid)
	{
		return "Success";
	}else
	{
		return "Index";
	}
		
	}

}
