package com.xworkz.waste.service;


import com.xworkz.waste.dto.WasteDTO;
import com.xworkz.waste.repository.WasteRepository;
import com.xworkz.waste.repository.WasteRepositoryImpl;
import com.xworkz.waste.util.ValidationUtil;

public class WasteServiceImpl implements WasteService {
	private WasteRepository wasteRepository;

	public WasteServiceImpl(WasteRepository wasteRepository)
	{
		this.wasteRepository=wasteRepository;
	}
	@Override
	public boolean validateAndSave(WasteDTO wasteDTO) {
		if(wasteDTO!=null)
		{
			System.out.println("Valid Data,Can Save..");
			System.out.println("Arg Passed :" +wasteDTO);
			String name=wasteDTO.getName();
			String type=wasteDTO.getType();
			double weight=wasteDTO.getWeight();
			
			if(ValidationUtil.validateString(name))
			{
				System.out.println("Name is valid...");
			}
			else
			{
				System.out.println("Name is Invalid..");
				return false;
			}
			if(ValidationUtil.validateString(type))
			{
				System.out.println("Type is valid...");
			}
			else
			{
				System.out.println("Type is Invalid..");
				return false;
			}
			if(ValidationUtil.validateDouble(weight))
			{
				System.out.println("Weight is valid..");
			}
			else
			{
				System.out.println("Weight is Invalid...");
				return false;
			}
			System.out.println("All the data of the Waste is Valid...");
			wasteRepository.save(wasteDTO);
			return true;
		}
		System.out.println("Invalid data,can not save..");
		return false;
	}
}
