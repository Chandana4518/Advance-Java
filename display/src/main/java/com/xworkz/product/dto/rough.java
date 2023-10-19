package com.xworkz.product.dto;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.war.dto.CountryDTO;
import com.xworkz.war.dto.PresidentDTO;
import com.xworkz.war.dto.WarDTO;

public class rough {
	collection.stream().sorted().forEach(e -> System.out.println(e));

	System.out.println("*** All Presidents ***");
	List<PresidentDTO> presidents = collection.stream().sorted()
			.flatMap(e -> e.getCountries().stream().sorted().map(v -> v.getPresident())).distinct()
			.collect(Collectors.toList());
	presidents.stream().sorted(). forEach(w -> System.out.println(w));

	System.out.println("*** Collect President by Country name ***");
	List<PresidentDTO> country = collection.stream().sorted().flatMap(e -> e.getCountries().stream().sorted())
			.filter(s -> s.getName().equals("Japan")).map(v->v.getPresident()).distinct()
			.collect(Collectors.toList());
	country.stream().sorted().forEach(e -> System.out.println(e));

	System.out.println("*** Collect all Country ***");
	List<CountryDTO> countryDTOs = collection.stream().sorted()
			.flatMap(e -> e.getCountries().stream()).distinct().collect(Collectors.toList());
	countryDTOs.stream().sorted().forEach(v -> System.out.println(v));

	System.out.println("*** Collect all Continents ***");
	Set<String> continents = collection.stream().sorted().flatMap(e -> e.getCountries().stream()
			.map(v -> v.getContinent())).collect(Collectors.toSet());
	continents.stream().forEach(v -> System.out.println(v));

	System.out.println("*** All by start Date and end Date ***");
	List<WarDTO> wars = collection.stream().sorted().collect(Collectors.toList());
	wars.forEach(e -> System.out.println("Start Date : " + e.getStartDate() + " End Date : " + e.getEndDate()));

	System.out.println("*** Collect countries by WarName ***");
	List<CountryDTO> list=collection.stream().sorted().
		filter(e->e.getName().equals("Korean War")).flatMap(v->v.getCountries().stream()).collect(Collectors.toList());
	list.forEach(v->System.out.println(v));
}
