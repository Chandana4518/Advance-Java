package com.xworkz.perfume.repo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.perfume.dto.PerfumeDTO;

@Component
public class PerfumeRepositoryImpl implements PerfumeRepository {
	@Autowired
	Collection<PerfumeDTO> perfume;

	@Override
	public boolean save(PerfumeDTO dto) {

		if (perfume.add(dto)) {
			return true;
		}
		return false;

	}

	@Override
	public Collection<PerfumeDTO> findByName(String name) {
		if (name != null) {
			List<PerfumeDTO> names = perfume.stream().filter(e -> e.getName().equalsIgnoreCase(name))
					.collect(Collectors.toList());
			names.forEach(e -> System.out.println(e));
		}
		return null;
	}

	@Override
	public Collection<PerfumeDTO> readAll() {

		return perfume;
	}

	@Override
	public boolean isExist(PerfumeDTO perfumeDTO) {
		Collection<PerfumeDTO> perfumes=readAll();
		for(PerfumeDTO dtos:perfumes)
		{
			if(dtos.getName().equals(perfumeDTO.getName()))
					{
				System.out.println("Already Exist");
				return true;
					}
		}
		System.out.println("Doesn't Exist");
		return false;
	}

	@Override
	public Collection<PerfumeDTO> updateByUsingName(String name, int price) {
		Collection<PerfumeDTO> update=readAll();
		for(PerfumeDTO dto:update)
		{
			if(dto.getName().equals(name))
			{
				dto.setPrice(price);
				return update;
			}
		}
		return null;
	}

}
