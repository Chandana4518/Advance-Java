package com.xworkz.waste.repository;

import com.xworkz.waste.dto.WasteDTO;

public class WasteRepositoryImpl implements WasteRepository {

	private WasteDTO[] dtos=new WasteDTO[TOTAL];
	private int temp=0;
	@Override
	public void save(WasteDTO wasteDTO) {
		
		if(temp<TOTAL)
		{
			System.out.println("Invoking save method in WasteRepositoryImpl");
			this.dtos[temp]=wasteDTO;
			System.out.println("The element stored at index :" +temp);
			temp++;
		}
		else
		{
			System.out.println("Array is full,can't save...");
		}

	}

}
