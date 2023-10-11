package com.xworkz.sport.runner;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

import com.xworkz.sport.dto.VegetableDTO;

public class VegetableRunner {

	public static void main(String[] args) {

		VegetableDTO dto = new VegetableDTO(1, "Carrot", 80, 2);
		VegetableDTO dto1 = new VegetableDTO(2, "Cabbage", 80, 1);
		VegetableDTO dto2 = new VegetableDTO(3, "Chilli", 180, 2);
		VegetableDTO dto3 = new VegetableDTO(4, "Tomato", 100, 5);
		VegetableDTO dto4 = new VegetableDTO(5, "Potato", 60, 1);
		VegetableDTO dto6 = new VegetableDTO(6, "Brinjal", 180, 3);

		Collection<VegetableDTO> collection = new HashSet<VegetableDTO>();

		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto6);

		Collection<VegetableDTO> a=new HashSet<VegetableDTO>();
		collection.forEach((e)->{
			if(e.getPrice()>=100)
			{
				System.out.println("Price is very high for :" +e.getName());
			}
			else
			{
				System.out.println("Price is ok :" +e.getName());
				a.add(e);
			}
		});
		a.forEach((n)->{
			System.out.println("Price less than 100:" +n.getName());
		});
		
		
		System.out.println("Total Vegetables :" + collection.size());

		boolean save = Collections.addAll(collection, dto6);
		System.out.println("addAll :" + save);
		boolean save6 = collection.isEmpty();
		System.out.println("isEmpty :" + save6);
		Iterator<VegetableDTO> iterator = collection.iterator();
		while (iterator.hasNext()) {
			VegetableDTO ele = iterator.next();
			System.out.println("Vegetable names :" + ele.getName());

		}
		boolean save1 = collection.remove(dto4);
		System.out.println("remove :" + save1);
		Collection<Integer> collection2 = new HashSet<Integer>();
		collection2.add(3);
		collection2.add(4);
		collection2.add(5);
		collection2.add(6);
		collection2.add(7);
		System.out.println("Collection :" + collection2);
		boolean save2 = collection.removeAll(collection2);
		System.out.println("removeAll :" + save2);
		boolean save3 = collection.contains(dto1);
		System.out.println("contains :" + save3);
		boolean save4 = collection.containsAll(collection2);
		System.out.println("containsAll :" + save4);

		boolean save5 = collection.retainAll(collection2);
		System.out.println("retainAll :" + save5);

	}

}
