package com.xworkz.tree.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.tree.dto.MovieDTO;
import com.xworkz.tree.dto.MovieLanguage;
import com.xworkz.tree.dto.PlayerDTO;

public class MovieRunner {

	public static void main(String[] args) {
		MovieDTO dto = new MovieDTO(1, "RRR", MovieLanguage.TELUGU,"D.V.V.Danayya", "Rajamouli", 5500000000L);
		MovieDTO dto1 = new MovieDTO(2, "Orange", MovieLanguage.TELUGU,"Nagendra Babu", "Bhaskar Natarajan",320000000L);
		MovieDTO dto2 = new MovieDTO(3, "Janatha Garage", MovieLanguage.TELUGU,"Naveen Yerneni", "Koratala Siva",500000000L);
		MovieDTO dto3 = new MovieDTO(4, "Jailer", MovieLanguage.TAMIL,"Kalanithi Maran", "Nelson Dilipkumar",2500000000L);
		MovieDTO dto4 = new MovieDTO(5, "Soorarai Pottru", MovieLanguage.TAMIL,"Suriya Jyothika", "Sudha Kongara",150000000L);
		MovieDTO dto5 = new MovieDTO(6, "Karnan", MovieLanguage.TAMIL, "Kalaipuli S. Thanu","Mari Selvaraj",250000000L);
		MovieDTO dto6 = new MovieDTO(7, "Salute ", MovieLanguage.MALAYALAM, "Dulquer Salmaan", "Rosshan Andrrews",00000000L);
		MovieDTO dto7 = new MovieDTO(8, "Premam", MovieLanguage.MALAYALAM, "Anwar Rasheed","Alphonse Puthren",40000000L);
		MovieDTO dto8 = new MovieDTO(9, "Ustad Hotel", MovieLanguage.MALAYALAM,"Listin Stephen","Anwar Rasheed",180000000L);
		MovieDTO dto9 = new MovieDTO(10, "Vinaya Vidheya Rama", MovieLanguage.TELUGU,"D. V. V. Danayya","Boyapati Srinu",700000000L);
		MovieDTO dto10 = new MovieDTO(11, "Dhrishyam", MovieLanguage.HINDI," Kumar Mangat Pathak","Nishikant Kamat",38000000L);
		MovieDTO dto11 = new MovieDTO(12, "Jawan", MovieLanguage.HINDI,"Gauri Khan","Atlee",3000000000L);
		MovieDTO dto12 = new MovieDTO(13, "Rocky Aur Rani Kii Prem Kahaani",MovieLanguage.HINDI,"Hiroo Yash Johar","Karan Johar",1500000000L);
		MovieDTO dto13 = new MovieDTO(14, "Krack", MovieLanguage.TELUGU, "Tagore B. Madhu","Gopichand Malineni",170000000L);
		MovieDTO dto14 = new MovieDTO(15, "Bawaal", MovieLanguage.HINDI, "Sajid Nadiadwala","Nitesh Tiwari",500000000L);
		MovieDTO dto15 = new MovieDTO(16, "Chathrapathi ", MovieLanguage.TELUGU, "B. V. S. N. Prasad", "Rajamouli",130000000L);
		MovieDTO dto16 = new MovieDTO(17, "Love Mocktail", MovieLanguage.KANNADA, "	Darling Krishna", "	Darling Krishna",20000000L);
		MovieDTO dto17 = new MovieDTO(18, "Kantara ", MovieLanguage.TELUGU, "Vijay Kiragandur", "Rishab Shetty",160000000L);
		MovieDTO dto18 = new MovieDTO(19, "After", MovieLanguage.ENGLISH, "Jennifer Gibgot", "Jenny Gage",14000000L);
		MovieDTO dto19 = new MovieDTO(20,"Inception",MovieLanguage.ENGLISH,"Emma Thomas","	Christopher Nolan",1600000000L);
		
		Collection<MovieDTO> collection = new HashSet<MovieDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		collection.add(dto11);
		collection.add(dto12);
		collection.add(dto13);
		collection.add(dto14);
		collection.add(dto15);
		collection.add(dto16);
		collection.add(dto17);
		collection.add(dto18);
		collection.add(dto19);
		Collection<MovieDTO> collection2 = new HashSet<MovieDTO>();
		collection.forEach((a) -> {
			if (a.getLanguage().equals(MovieLanguage.TELUGU)) {
				System.out.println("Telugu Movies :" + a.getName());
				collection2.add(a);
			}
		});
		collection2.forEach((b) -> {
			System.out.println(b.getName());
		});
		Collection<MovieDTO> collection3 = new HashSet<MovieDTO>();
		collection.forEach((c) -> {
			if (c.getProducer().equals("D.V.V.Danayya")) {
				System.out.println("Movies by Producer D.V.V.Danayya :" + c.getName());
				collection2.add(c);
			}
		});
		collection2.forEach((d) -> {
			System.out.println(d.getName());
		});
		Collection<MovieDTO> collection4 = new HashSet<MovieDTO>();
		collection.forEach((e) -> {
			if (e.getDirector().equals("Rajamouli")) {
				System.out.println("Movies by Director Rajamouli  :" + e.getName());
				collection2.add(e);
			}
		});
		collection2.forEach((f) -> {
			System.out.println(f.getName());
		});
		Collection<MovieDTO> collection5 = new HashSet<MovieDTO>();
		collection.forEach((g) -> {
			if (g.getBudget() > 1000000000L) {
				System.out.println("Movies budget greater than 1 CR :" + g.getName());
				collection2.add(g);
			}
		});
		collection2.forEach((h) -> {
			System.out.println(h.getName());
		});
		Iterator<MovieDTO> iterator=collection.iterator();

		
		while(iterator.hasNext())
		{
			MovieDTO ele=iterator.next();
			System.out.println(ele.getName());
			if(ele.getBudget()<10000000L)
			{
				System.out.println("Budget Less than 1 CR :" +ele.getName());
				iterator.remove();
			}
		}
		collection.forEach((i)->{
			System.out.println(i.getName());
		});

	}

}
