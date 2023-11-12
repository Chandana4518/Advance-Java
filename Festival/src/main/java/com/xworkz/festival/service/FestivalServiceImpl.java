package com.xworkz.festival.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.repo.FestivalRepository;

@Component
public class FestivalServiceImpl implements FestivalService {
@Autowired
private	FestivalRepository repository;
	@Override
	public boolean validateAndSave(FestivalDTO dto) {
		if(dto!=null)
		{
			if(dto.getFestivalName()!=null && !dto.getFestivalName().isEmpty())
			{
				if(dto.getDate()!=null && !dto.getDate().isEmpty())
				{
					if(dto.getSeason()!=null && !dto.getSeason().isEmpty())
					{
						if(dto.getNoOfDays()>0)
						{
							return repository.save(dto);
						}
						System.out.println("No of days Invallid");
						return false;
					}
					System.out.println("Season Invalid");
						return false;
				}
				System.out.println("Date Invalid");
				return false;
					
			}
			System.out.println("Festival name Invalid");
			return false;
		}
		System.out.println("Dto Invalid");
		return false;
	}

}
