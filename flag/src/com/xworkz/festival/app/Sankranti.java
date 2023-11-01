package com.xworkz.festival.app;

import com.xworkz.festival.Festival;

public class Sankranti implements Festival {

	@Override
	public void celebrate() {
		System.out.println("Celebrating Sankranti");
	}

	@Override
	public void doPooja() {
		System.out.println("Sankranti..");

	}


}
