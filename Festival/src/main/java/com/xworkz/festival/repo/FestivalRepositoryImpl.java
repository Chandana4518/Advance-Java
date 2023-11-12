package com.xworkz.festival.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.xworkz.festival.dto.FestivalDTO;
@Component
public class FestivalRepositoryImpl implements FestivalRepository {
	
	List<FestivalDTO> list=new ArrayList<FestivalDTO>();
	@Override
	public boolean save(FestivalDTO dto) {
		
	return list.add(dto);
		
	}

}
