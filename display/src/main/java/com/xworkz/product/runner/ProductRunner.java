package com.xworkz.product.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.xworkz.product.dto.AddressDTO;
import com.xworkz.product.dto.BrandDTO;

import com.xworkz.product.dto.ProductDTO;
import com.xworkz.product.dto.Type;

public class ProductRunner {

	public static void main(String[] args) {

		AddressDTO addressDTO = new AddressDTO(1, 10, "BTM", "Bengalore", "Karnataka", "516483");
		AddressDTO addressDTO1 = new AddressDTO(2, 11, "Tower Clock", "Anantapur", "Andhra Pradesh", "515231");
		AddressDTO addressDTO2 = new AddressDTO(3, 12, "Sangameswara", "Anantapur", "Andhra Pradesh","515463");
		AddressDTO addressDTO3 = new AddressDTO(4, 13, "Hebbal", "Bengalore", "Karnataka", "516583");
		AddressDTO addressDTO4 = new AddressDTO(5, 14, "Mysore", "Mysore", "Karnataka", "516484");
		AddressDTO addressDTO5 = new AddressDTO(6, 15, "Vittasandra", "Chittor", "Andhra Pradesh", "515593");

		BrandDTO brandDTO = new BrandDTO(1, "IKEA", "22AAAAA0000A1Z5", addressDTO, LocalDate.of(2000, 10, 4));
		BrandDTO brandDTO1 = new BrandDTO(2, "Sony", "32ABSAA0000A1Z5", addressDTO1, LocalDate.of(2003, 11, 1));
		BrandDTO brandDTO2 = new BrandDTO(3, "Lakme", "42ABCAA0000A1Z5", addressDTO2, LocalDate.of(1999, 1, 13));
		BrandDTO brandDTO3 = new BrandDTO(4, "Burrow", "28AAAAA0000A1Z5", addressDTO3, LocalDate.of(2012, 2, 14));
		BrandDTO brandDTO4 = new BrandDTO(5, "General", "31AMSAA0000A1Z5", addressDTO4, LocalDate.of(1989, 12, 10));
		BrandDTO brandDTO5 = new BrandDTO(6, "Hero", "72AISAA0000A1Z5", addressDTO5, LocalDate.of(2007, 10, 1));

		ProductDTO productDTO = new ProductDTO(1, "Door", Type.FURNITURE, brandDTO, 2000, 2.0);
		ProductDTO productDTO1 = new ProductDTO(2, "Tv", Type.ELECTRONICS, brandDTO1, 30000, 1.0);
		ProductDTO productDTO2 = new ProductDTO(3, "LipStick", Type.BEAUTY, brandDTO2, 300, 1.0);
		ProductDTO productDTO3 = new ProductDTO(4, "Fan", Type.ELECTRONICS, brandDTO3, 800, 1.0);
		ProductDTO productDTO4 = new ProductDTO(5, "Spoon", Type.KITCHEN_APP, brandDTO4, 100, 4.0);
		ProductDTO productDTO5 = new ProductDTO(6, "Bike", Type.TRAVEL, brandDTO5, 1000, 1.0);

		Collection<ProductDTO> collection = new HashSet<ProductDTO>();
		collection.add(productDTO5);
		collection.add(productDTO4);
		collection.add(productDTO3);
		collection.add(productDTO2);
		collection.add(productDTO1);
		collection.add(productDTO);

		collection.stream().sorted().forEach(e -> System.out.println(e));
		
		System.out.println("*** Get all ProductDTO by pincode sort by Desc ***");
		List<AddressDTO> pincode=collection.stream().map(v->v.getBrand().getAddress())
				.sorted((a1,a2)->a2.getPincode().compareTo(a1.getPincode()))
				.filter(v->v.getPincode().equals(v.getPincode())).collect(Collectors.toList());
		pincode.forEach(v->System.out.println(v));
		

		System.out.println("*** Get all ProductDTO by Type,sort by price in desc ***");
		Optional<ProductDTO> type = collection.stream().sorted().filter(p -> p.getType().equals(Type.BEAUTY))
				.collect(Collectors.toList()).stream().max((a1, a2) -> a2.compareTo(a1));
		if (type.isPresent()) {
			System.out.println(type);

		}
		
		System.out.println("*** Get BrandDTO by AddressDTO ***");
		List<BrandDTO> brandDTOs = collection.stream().sorted().map(e -> e.getBrand()).collect(Collectors.toList());
		brandDTOs.stream().sorted().forEach(e -> System.out.println(e));
		
		System.out.println("*** Get AddressDTO by BrandDTO ***");
		Optional<AddressDTO> addressDTOs = collection.stream().sorted().map(v -> v.getBrand().getAddress()).findFirst();
		if (addressDTOs.isPresent()) {
			System.out.println(addressDTOs);

		}
		
		System.out.println("*** Get ProductDTO by max price ***");
		
		 Optional<ProductDTO> maxPrice= collection.stream()
				.filter(p -> p.getPrice() <= 100000).findFirst();
		 if (maxPrice.isPresent()) {
				System.out.println(maxPrice);

			}
			
		System.out.println("*** Get all ProductDTO sorted by quantity in desc order ***");
		Optional<ProductDTO> quantity = collection.stream().sorted((a1,a2)->Double.compare(a2.getQuantity(), a1.getQuantity())).filter(p -> p.getQuantity()==4.0)
				.collect(Collectors.toList()).
				stream().max((a1, a2) -> a2.compareTo(a1));
		if (quantity.isPresent()) {
			System.out.println(quantity);

		}
		
		System.out.println("*** Get all AddressDTO by product name sort by id desc order ***");
		Optional<ProductDTO> name = collection.stream().sorted((a1,a2)->Integer.compare(a2.getId(), a1.getId())).filter(p -> p.getName().equals("Fan"))
				.collect(Collectors.toList()).
				stream().max((a1, a2) -> a2.compareTo(a1));
		if (name.isPresent()) {
			System.out.println(name);

		}
		

		List<String> names=new ArrayList<String>();
		names.add("Rohit");
		names.add("virat");
		names.add("Gill");
		names.add("Adithya");
		names.add("Amit");
		
		
		System.out.println("*** Using Iterator ***");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			String ele=itr.next();
			System.out.println(ele);
		}
		
		System.out.println("*** Using ListIterator Forward ***");
		
		ListIterator<String> listItr=names.listIterator(1);
		while(listItr.hasPrevious())
		{
			String e=listItr.previous();
			System.out.println(e);
		}
		
		System.out.println("*** Using ListIterator Backward ***");
		ListIterator<String> listItrBackward=names.listIterator(4);
		while(listItrBackward.hasPrevious())
		{
			String e=listItrBackward.previous();
			System.out.println(e);
		}
		
		
		
		
	}

}
