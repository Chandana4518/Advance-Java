package com.xworkz.waste.service;

import com.xworkz.waste.dto.WasteDTO;

public interface WasteService {
	
	boolean validateAndSave(WasteDTO wasteDTO);

}
