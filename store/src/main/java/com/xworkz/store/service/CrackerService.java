package com.xworkz.store.service;

import org.springframework.ui.Model;

import com.xworkz.store.dto.CrackerDTO;

public interface CrackerService {
	
	public boolean validate(CrackerDTO dto,Model model);

}
