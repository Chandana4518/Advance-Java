package com.xworkz.sweet.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@Controller
public class SweetController {

	public SweetController() {
		System.out.println("Created Servlet....");
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String get() {
		return "Shop";
	}

	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public String getData(Model model) {
		model.addAttribute("Message", "Hello");
		return "Shop";
	}

	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public String sendSweets(@RequestParam String sweetName, @RequestParam int price, Model model) {
		System.out.println("Method Working...");
		System.out.println(sweetName);
		System.out.println(price);
		if (sweetName != null && !sweetName.isEmpty()) {
			if (price > 100) {
				model.addAttribute("Valid", "Entered Valid name");
				return "index";
			}
		}
		model.addAttribute("Valid", "Enterd Invalid price");
		return "index";

	}

}
