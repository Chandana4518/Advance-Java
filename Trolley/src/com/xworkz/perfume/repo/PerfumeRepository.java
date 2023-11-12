package com.xworkz.perfume.repo;

import java.util.Collection;

import com.xworkz.perfume.dto.PerfumeDTO;

public interface PerfumeRepository {
	
	public boolean save(PerfumeDTO dto);
	
	public Collection<PerfumeDTO> findByName(String name);
	
	public Collection<PerfumeDTO> readAll();
	
	public boolean isExist(PerfumeDTO perfumeDTO);
	
	public Collection<PerfumeDTO> updateByUsingName(String name,int price);
	

}
