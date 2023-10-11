package com.xworkz.sport.runner;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.sport.dto.VegetableDTO;

public class emailRunner {

	public static void main(String[] args) {
		Collection<String> collection = new HashSet<String>();
		collection.add("abc@gmail.com");
		collection.add("rakhi@gmail.com");
		collection.add("chandu@gmail.com");
		collection.add("thanu@gmail.com");
		collection.add("lucky@gmail.com");
		collection.add("raghu@gmail.com");
		collection.add("adithya@gmail.com");
		collection.add("hasini@gmail.com");
		collection.add("kasi@gmail.com");
		
		System.out.println("Total Emails :" + collection.size());
		boolean a = Collections.addAll(collection,"harsha@gmail.com");
		System.out.println("addAll :" + a);
		boolean b = collection.isEmpty();
		System.out.println("isEmpty :" + b);
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			String ele = iterator.next();
			System.out.println("Email :" + ele);

		}
		boolean c = collection.remove("lucky@gmail.com");
		System.out.println("remove :" + c);
		
		Collection<Integer> collection2=new HashSet<Integer>();
		collection2.add(3);
		collection2.add(4);
		collection2.add(5);
		collection2.add(6);
		collection2.add(7);
		System.out.println("Collection :" +collection2);
		boolean d = collection.removeAll(collection2);
		System.out.println("removeAll :" + d);
		boolean e = collection.contains("raghu@gmail.com");
		System.out.println("contains :" + e);
		boolean f = collection.containsAll(collection2);
		System.out.println("containsAll :" + f);

		boolean g = collection.retainAll(collection2);
		System.out.println("retainAll :" + g);
	}

}
