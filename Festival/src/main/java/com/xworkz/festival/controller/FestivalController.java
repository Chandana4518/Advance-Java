package com.xworkz.festival.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.service.FestivalService;

@Controller
public class FestivalController {
	@Autowired
	private FestivalService service;
	
	@RequestMapping(value = "/send" ,method = RequestMethod.POST)
	public String send(FestivalDTO dto,Model model)
	{
		boolean saved=service.validateAndSave(dto);
		if(saved)
		{
		model.addAttribute("saved","Data saved successfully!!!!");
		return "success";
		}
		else
		{
			model.addAttribute("saved","Data not saved successfully!!!!");
			return "index";
		}
	}
	
}
