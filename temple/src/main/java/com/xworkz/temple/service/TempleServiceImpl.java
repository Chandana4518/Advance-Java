package com.xworkz.temple.service;

import java.util.Collection;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repo.TempleRepository;

public class TempleServiceImpl implements TempleService {
	private TempleRepository templeRepository;

	public TempleServiceImpl(TempleRepository templeRepository) {
		this.templeRepository = templeRepository;

	}

	@Override
	public boolean validateAndSave(TempleDTO dto) {
		System.out.println("Invoking validateAndSave method in TempleServiceImpl");
		templeRepository.save(dto);
		return true;
	}

	@Override
	public int total() {
		return this.templeRepository.total();
	}

	@Override
	public Collection<TempleDTO> getAll() {
		return this.templeRepository.getAll();
	}

}
