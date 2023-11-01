package com.xworkz.festival.app;

import com.xworkz.festival.Festival;

public class Onam implements Festival {

	@Override
	public void celebrate() {
		System.out.println("Celebrating Onam");
	}

	@Override
	public void doPooja() {
		System.out.println("Onam..");

	}


}
