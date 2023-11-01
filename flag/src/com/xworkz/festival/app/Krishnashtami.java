package com.xworkz.festival.app;

import com.xworkz.festival.Festival;

public class Krishnashtami implements Festival {

	@Override
	public void celebrate() {
		System.out.println("Celebrating Krishnashtami");
	}

	@Override
	public void doPooja() {
		System.out.println("Krishnashtami..");

	}


}
