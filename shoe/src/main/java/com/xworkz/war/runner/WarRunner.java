package com.xworkz.war.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.war.dto.CountryDTO;
import com.xworkz.war.dto.PresidentDTO;
import com.xworkz.war.dto.WarDTO;

public class WarRunner {

	public static void main(String[] args) {
		List<CountryDTO> countryList = new ArrayList<CountryDTO>();

		PresidentDTO presidentDTO1 = new PresidentDTO(1, "Woodrow Wilson", 58, LocalDate.of(1914, 7, 28),
				LocalDate.of(1918, 11, 11));
		PresidentDTO presidentDTO2 = new PresidentDTO(2, "Paul Deschanel", 59, LocalDate.of(1914, 7, 28),
				LocalDate.of(1918, 11, 11));
		PresidentDTO presidentDTO3 = new PresidentDTO(3, "Terauchi Masatake", 62, LocalDate.of(1914, 7, 28),
				LocalDate.of(1918, 11, 11));
		PresidentDTO presidentDTO4 = new PresidentDTO(4, "Friedrich Ebert", 60, LocalDate.of(1914, 7, 28),
				LocalDate.of(1918, 11, 11));
		PresidentDTO presidentDTO5 = new PresidentDTO(5, "Barack Obama", 67, LocalDate.of(2009, 01, 20),
				LocalDate.of(2017, 01, 20));
		PresidentDTO presidentDTO6 = new PresidentDTO(6, "Vladimir Putin", 58, LocalDate.of(2000, 05, 07),
				LocalDate.of(2023, 05, 07));
		PresidentDTO presidentDTO7 = new PresidentDTO(7, "Woodrow Wilson", 55, LocalDate.of(1914, 7, 28),
				LocalDate.of(1918, 11, 11));
		PresidentDTO presidentDTO8 = new PresidentDTO(8, "Nelson Mandela", 70, LocalDate.of(1994, 05, 10),
				LocalDate.of(1999, 06, 14));
		PresidentDTO presidentDTO9 = new PresidentDTO(9, "Vladimir Putin", 69, LocalDate.of(2000, 12, 31),
				LocalDate.of(2008, 5, 7));
		PresidentDTO presidentDTO10 = new PresidentDTO(10, "Winston Churchill", 90, LocalDate.of(1940, 5, 10),
				LocalDate.of(1955, 4, 5));
		PresidentDTO presidentDTO11 = new PresidentDTO(11, "Alberto Fernández", 74, LocalDate.of(1982, 04, 02),
				LocalDate.of(1982, 06, 14));
		PresidentDTO presidentDTO12 = new PresidentDTO(12, "Abraham Lincoln", 84, LocalDate.of(1861, 04, 12),
				LocalDate.of(1865, 05, 07));
		PresidentDTO presidentDTO13 = new PresidentDTO(13, "Kim Il-sung", 76, LocalDate.of(1950, 06, 25),
				LocalDate.of(1953, 07, 27));

		CountryDTO countryDTO1 = new CountryDTO(1, "United States", presidentDTO1, "North America");
		CountryDTO countryDTO2 = new CountryDTO(2, "France", presidentDTO2, "Europe");
		CountryDTO countryDTO3 = new CountryDTO(3, "Japan", presidentDTO3, "Asia");
		CountryDTO countryDTO4 = new CountryDTO(4, "Germany", presidentDTO4, "Europe");
		CountryDTO countryDTO5 = new CountryDTO(5, "Brazil", presidentDTO5, "South America");
		CountryDTO countryDTO6 = new CountryDTO(6, "Russia", presidentDTO6, "Europe");
		CountryDTO countryDTO7 = new CountryDTO(7, "South Africa", presidentDTO7, "Africa");
		CountryDTO countryDTO8 = new CountryDTO(8, "China", presidentDTO8, "Asia");
		CountryDTO countryDTO9 = new CountryDTO(9, "United Kingdom", presidentDTO9, "Europe");
		CountryDTO countryDTO10 = new CountryDTO(10, "India", presidentDTO10, "Asia");
		CountryDTO countryDTO11 = new CountryDTO(11, "Argentina", presidentDTO11, "South America");
		CountryDTO countryDTO12 = new CountryDTO(12, "America", presidentDTO12, "South America");
		CountryDTO countryDTO13 = new CountryDTO(13, "North Korea", presidentDTO13, "Asia");

		countryList.add(countryDTO1);
		countryList.add(countryDTO2);
		countryList.add(countryDTO3);
		countryList.add(countryDTO4);
		countryList.add(countryDTO5);
		countryList.add(countryDTO6);
		countryList.add(countryDTO8);
		countryList.add(countryDTO9);
		countryList.add(countryDTO7);
		countryList.add(countryDTO10);
		countryList.add(countryDTO11);
		countryList.add(countryDTO12);
		countryList.add(countryDTO13);

		List<CountryDTO> americanWar = new ArrayList<CountryDTO>();
		americanWar.add(countryDTO9);
		americanWar.add(countryDTO6);
		americanWar.add(countryDTO2);
		americanWar.add(countryDTO12);

		List<CountryDTO> koreanWar = new ArrayList<CountryDTO>();
		koreanWar.add(countryDTO8);
		koreanWar.add(countryDTO1);
		koreanWar.add(countryDTO13);

		List<CountryDTO> falklandsWar = new ArrayList<CountryDTO>();
		falklandsWar.add(countryDTO9);
		falklandsWar.add(countryDTO1);
		falklandsWar.add(countryDTO11);

		List<CountryDTO> revolWar = new ArrayList<CountryDTO>();
		revolWar.add(countryDTO2);
		revolWar.add(countryDTO1);

		List<CountryDTO> war = new ArrayList<CountryDTO>();
		war.add(countryDTO9);
		war.add(countryDTO1);

		WarDTO dto1 = new WarDTO(1, "World War I", LocalDate.of(1914, 7, 28), LocalDate.of(1918, 11, 11), countryList,
				"Japan");
		WarDTO dto2 = new WarDTO(2, "American Civil War", LocalDate.of(1861, 04, 12), LocalDate.of(1865, 05, 07),
				americanWar, "America");
		WarDTO dto3 = new WarDTO(3, "World War 2", LocalDate.of(1914, 7, 28), LocalDate.of(1918, 11, 11), countryList,
				"Japan");
		WarDTO dto4 = new WarDTO(4, "Korean War", LocalDate.of(1950, 06, 25), LocalDate.of(1953, 07, 27), koreanWar,
				"North Korea");
		WarDTO dto5 = new WarDTO(5, "Falklands War", LocalDate.of(1982, 04, 02), LocalDate.of(1982, 06, 14),
				falklandsWar, "Argentina");
		WarDTO dto6 = new WarDTO(6, "American Revolutionary War", LocalDate.of(1775, 4, 19), LocalDate.of(1783, 9, 3),
				revolWar, "United States");
		WarDTO dto7 = new WarDTO(7, "War of 1812", LocalDate.of(1812, 6, 18), LocalDate.of(1815, 2, 18), war,
				"United States");

		Collection<WarDTO> collection = new HashSet<WarDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);

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
}
