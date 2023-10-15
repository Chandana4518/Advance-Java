package com.xworkz.cloth.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.xworkz.cloth.dto.BrandDTO;

public class BrandRunner {

	public static void main(String[] args) {

		BrandDTO dto1 = new BrandDTO("Apple", "Tim Cook", 800, "USA");
		BrandDTO dto2 = new BrandDTO("Nike", "Phil Knight", 48.8, "USA");
		BrandDTO dto3 = new BrandDTO("H&M", "Helena Helmersson", 223.55, "Sweden");
		BrandDTO dto4 = new BrandDTO("Adidas", "Bjorn Gulden", 22.5, "Germany");
		BrandDTO dto5 = new BrandDTO("Dove", "Rahul Bhanushali", 6.5, "USA");
		BrandDTO dto6 = new BrandDTO("Puma", "Arne Freundt", 8.47, "Germany");
		BrandDTO dto7 = new BrandDTO("Bajaj", "Sanjiv", 290.18, "India");
		BrandDTO dto8 = new BrandDTO("KFC", "Sabir", 31.116, "USA");
		BrandDTO dto9 = new BrandDTO("Zara", "Amancio Ortega Gaona", 18, "Spain");
		BrandDTO dto10 = new BrandDTO("IAudi", "Volkswagen", 34.2, "Germany");

		Collection<BrandDTO> collection = new HashSet<BrandDTO>();

		collection.add(dto10);
		collection.add(dto9);
		collection.add(dto8);
		collection.add(dto7);
		collection.add(dto6);
		collection.add(dto5);
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);

		collection.stream().sorted().forEach((e) -> System.out.println(e));
		System.out.println("*** RevenueInBillion is greater than 20 ***");
		collection.stream().sorted().filter((e) -> e.getRevenueInBillion() > 20)
				.forEach((e) -> System.out.println(e.getName()));
		
		System.out.println("*** RevenueInBillion is less than 20 ***");
		collection.stream().sorted().forEach((e) -> {
			if (e.getRevenueInBillion() < 20) {
				System.out.println(e.getName());
			}
		});
		Collection<BrandDTO> collection1 = new HashSet<BrandDTO>();

		System.out.println("*** Brand from USA ***");
		collection.stream().sorted().filter((e)->(e.getCountry().equals("USA")))
				.forEach((e) -> {
					
				System.out.println(e.getName());
				collection1.add(e);});
				
		collection1.stream().sorted().forEach((v) -> {
			System.out.println(v);
		});
		Collection<BrandDTO> collection2 = new HashSet<BrandDTO>();
		System.out.println("*** Brand is not from USA ***");
		collection.stream().sorted().forEach((e) -> {
			if (!e.getCountry().equals("USA")) {
				System.out.println(e.getName());
				collection2.add(e);
			}

		});
		collection2.stream().sorted().forEach((v) -> {
			System.out.println(v);
		});
		Collection<BrandDTO> collection3 = new HashSet<BrandDTO>();
		System.out.println("*** Name startswith I ***");

		collection.stream().sorted().forEach((e) -> {
			if (e.getName().startsWith("I")) {
				System.out.println(e.getName());
			}
		});
		collection3.stream().sorted().forEach((v) -> {
			System.out.println(v);
		});
		Collection<BrandDTO> collection4 = new HashSet<BrandDTO>();
		System.out.println("*** Owner name length greater than 5 ***");
		collection.stream().sorted().forEach((e) -> {
			if (e.getOwner().length() > 5) {
				System.out.println(e.getName());
				collection4.add(e);
			}
		});
		collection4.stream().sorted().forEach((v) -> {
			System.out.println(v);
		});
		System.out.println("*** Owner name length less than 5 ***");
		collection.stream().sorted().forEach((e) -> {
			if (e.getOwner().length() <= 5) {
				System.out.println(e.getName());

			}
		});
	}

}
