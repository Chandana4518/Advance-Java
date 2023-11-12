package com.xworkz.perfume.runner;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.perfume.config.PerfumeConfig;
import com.xworkz.perfume.dto.PerfumeDTO;
import com.xworkz.perfume.repo.PerfumeRepository;
import com.xworkz.perfume.repo.PerfumeRepositoryImpl;
import com.xworkz.perfume.service.PerfumeService;
import com.xworkz.perfume.service.PerfumeServiceImpl;

public class PerfumeRunner {

	public static void main(String[] args) {

		PerfumeDTO perfumeDTO = new PerfumeDTO("Calvin Klein", 1800, "New York", 250, "Citrus Aromatic");
		ApplicationContext context = new AnnotationConfigApplicationContext(PerfumeConfig.class);
		PerfumeService service = context.getBean(PerfumeServiceImpl.class);
		PerfumeRepository repository = context.getBean(PerfumeRepositoryImpl.class);
		service.validateAndSave(perfumeDTO);
		service.findByName("Calvin Klein");

		Collection<PerfumeDTO> saved = service.readAll();
		System.out.println(saved);
		
		boolean check=service.isExist(perfumeDTO);
		System.out.println(check);
		
		Collection<PerfumeDTO> checks=service.updateByUsingName("Calvin Klein",2000);
		for(PerfumeDTO dto:checks)
		{
			System.out.println(dto);
		}



	}

}
