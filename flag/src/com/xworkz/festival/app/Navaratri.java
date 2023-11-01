package com.xworkz.festival.app;

import com.xworkz.festival.Festival;

public class Navaratri implements Festival {

	@Override
	public void celebrate() {
		System.out.println("Celebrating Navaratri");
	}

	@Override
	public void doPooja() {
		System.out.println("Navaratri..");

	}


}
