package com.xworkz.perfume.service;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.perfume.dto.PerfumeDTO;

public interface PerfumeService {

	public boolean validateAndSave(PerfumeDTO dto);

	public Collection<PerfumeDTO> findByName(String name);

	public Collection<PerfumeDTO> readAll();

	public boolean isExist(PerfumeDTO perfumeDTO);

	public Collection<PerfumeDTO> updateByUsingName(String name, int price);

}
