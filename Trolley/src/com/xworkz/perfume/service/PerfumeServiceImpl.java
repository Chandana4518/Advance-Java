package com.xworkz.perfume.service;

import java.util.Collection;

import org.codehaus.plexus.component.annotations.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.perfume.dto.PerfumeDTO;
import com.xworkz.perfume.repo.PerfumeRepository;

@org.springframework.stereotype.Component
public class PerfumeServiceImpl implements PerfumeService {
	@Autowired
	PerfumeRepository repository;

	@Override
	public boolean validateAndSave(PerfumeDTO dto) {
		if (dto.getName() != null && dto.getName().length() >= 3) {
			if (dto.getPrice() != 0 && dto.getPrice() >= 1000) {
				if (dto.getOriginalCountry() != null && dto.getOriginalCountry().length() >= 3) {
					if (dto.getQuantity() != 0 && dto.getQuantity() >= 3) {
						if (dto.getSmell() != null && dto.getSmell().length() >= 3) {
							System.out.println("Data saved...");
							repository.save(dto);
							return true;
						}
					}
				}
			}
		}
		System.out.println("Data not saved...");
		return false;
	}

	@Override
	public Collection<PerfumeDTO> findByName(String name) {
		if (name != null && name.length() >= 3) {
			return repository.findByName(name);
		}
		return null;
	}

	@Override
	public Collection<PerfumeDTO> readAll() {

		return repository.readAll();
	}

	@Override
	public boolean isExist(PerfumeDTO perfumeDTO) {

		return repository.isExist(perfumeDTO);
	}

	@Override
	public Collection<PerfumeDTO> updateByUsingName(String name, int price) {
		if (name != null && name.length() > 3 && price > 1000) {
			 return repository.updateByUsingName(name, price);
		}
		return null;

	}

}
