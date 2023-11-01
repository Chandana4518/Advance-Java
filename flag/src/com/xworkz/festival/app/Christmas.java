package com.xworkz.festival.app;

import com.xworkz.festival.Festival;

public class Christmas implements Festival {

	@Override
	public void celebrate() {
		System.out.println("Celebrating Christmas");
	}

	@Override
	public void doPooja() {
		System.out.println("Christmas..");
	}

}
