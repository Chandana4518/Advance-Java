package com.xworkz.temple.repo;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import com.xworkz.temple.dto.TempleDTO;

public class TempleRepositoryImpl implements TempleRepository {

	private Collection<TempleDTO> group = new HashSet<TempleDTO>();

	@Override
	public void save(TempleDTO dto) {
		System.out.println("Invoking save method in TempleRepositoryImpl");
		boolean saved = this.group.add(dto);
		if (saved) {
			System.out.println("Saved in Repo :" + saved);
		} else {
			System.out.println("Not saved :" + saved);
		}
	}

	@Override
	public int total() {
		return this.group.size();
	}

	@Override
	public Collection<TempleDTO> getAll() {
		return this.group;
	}

}
