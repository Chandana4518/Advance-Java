package com.xworkz.waste.repository;

import com.xworkz.waste.dto.WasteDTO;

public interface WasteRepository {
	
	int TOTAL=5;
	void save(WasteDTO wasteDTO);

}
