package com.xworkz.movie.runner;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.movie.dto.ActorDTO;

public class ActorRunner {

	public static void main(String[] args) {

		ActorDTO dto1 = new ActorDTO(0, "Jr.NTR", "Telugu", "Male", "India");
		ActorDTO dto2 = new ActorDTO(1, "Meryl Streep", "English", "Female", "USA");
		ActorDTO dto3 = new ActorDTO(2, "Jean Dujardin", "French", "Male", "France");
		ActorDTO dto4 = new ActorDTO(3, "Rachel McAdams", "English", "Female", "Cannada");
		ActorDTO dto5 = new ActorDTO(4, "Hugh Jackman", "English", "Male", "Australia");
		ActorDTO dto6 = new ActorDTO(5, "Park Shin-hye", "Korean", "Female", "South korea");
		ActorDTO dto7 = new ActorDTO(6, "Gael García Bernal", "Spanish", "Male", "Mexico");
		ActorDTO dto8 = new ActorDTO(7, "Rinko Kikuchi", "Japanese", "Female", "Japan");
		ActorDTO dto9 = new ActorDTO(8, "JDaniel Radcliffe", "English", "Male", "UK");
		ActorDTO dto10 = new ActorDTO(9, "Sai Pallavi", "Malayalam", "Female", "India");

		Collection<ActorDTO> collection = new HashSet<ActorDTO>();
		collection.add(dto9);
		collection.add(dto8);
		collection.add(dto7);
		collection.add(dto6);
		collection.add(dto5);
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		collection.add(dto10);
		System.out.println("*** Actors in Desc order by name ***");
		List<ActorDTO> actorList = collection.stream().sorted().collect(Collectors.toList());
		actorList.forEach((e) -> System.out.println(e.getName()));
		System.out.println("*** Country in Uppercase in Desc order ***");
		List<String> country = collection.stream().sorted().map((e) -> e.getCountry().toUpperCase())
				.collect(Collectors.toList());

		country.forEach((e) -> System.out.println(e));
		System.out.println("*** Id in Asc order ***");
		List<Integer> list = collection.stream().map(e -> e.getId()).sorted((a1, a2) -> a1.compareTo(a2))
				.collect(Collectors.toList());

		list.forEach(e -> System.out.println(e));
		System.out.println("*** Actors in Asc order by LangKnown ***");
		List<ActorDTO> lang = collection.stream().sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
				.filter((e) -> e.getLangKnown().equals("English")).collect(Collectors.toList());

		lang.forEach(e -> System.out.println(e));
		System.out.println("*** Actors in Desc order by LangKnown ***");
		List<ActorDTO> langDesc = collection.stream().sorted().filter((e) -> e.getLangKnown().equals("English"))
				.collect(Collectors.toList());

		langDesc.forEach(e -> System.out.println(e));
		System.out.println("*** Actors by Male ***");
		collection.stream().sorted().filter((e) -> e.getGender().equals("Male")).forEach(e -> System.out.println(e));
		System.out.println("*** Actors by Female ***");
		List<ActorDTO> female = collection.stream().sorted().filter(e -> e.getGender().equals("Female"))
				.collect(Collectors.toList());

		female.forEach(e -> System.out.println(e));
		System.out.println("*** Filter by all Country and Count ***");
		List<ActorDTO> countries = collection.stream().sorted().filter((e) -> e.getCountry().equals("India"))
				.collect(Collectors.toList());
		countries.forEach(e -> System.out.println(e));
		System.out.println("Count :" + countries.size());
		System.out.println("*** Id>5 and sort in Asc order ***");
		List<ActorDTO> id = collection.stream().filter(e -> e.getId() > 5).sorted((a1, a2) -> a1.compareTo(a2))
				.collect(Collectors.toList());

		id.forEach(e -> System.out.println(e));
	}
}
