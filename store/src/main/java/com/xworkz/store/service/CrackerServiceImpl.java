package com.xworkz.store.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.store.dto.CrackerDTO;

@Component
public class CrackerServiceImpl implements CrackerService {
	@Override
	public boolean validate(CrackerDTO dto, Model model) {
		if (dto != null) {
			if (dto.getName() == null || dto.getName().isEmpty()) {

				model.addAttribute("validName", "Name not Valid");

			}
			if (dto.getBrand() == null || dto.getBrand().isEmpty()) {

				model.addAttribute("validBrand", "Brand not Valid");

			}
			if (dto.getColor() == null || dto.getColor().isEmpty()) {

				model.addAttribute("validColor", "Color not Valid");

			}
			if (dto.getPrice() <= 0) {

				model.addAttribute("validPrice", "Price not Valid");

			}
			if (dto.getLength() <= 0) {

				model.addAttribute("validLength", "Length not Valid");

			}
			if (model.containsAttribute("validName") || model.containsAttribute("validBrand")
					|| model.containsAttribute("validColor") || model.containsAttribute("validPrice")
					|| model.containsAttribute("validLength")) {
				return false;
			}
			model.addAttribute("validDto", dto);
			return true;
		}
		return false;

	}
}
