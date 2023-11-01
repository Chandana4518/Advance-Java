package com.xworkz.festival.app;

import com.xworkz.festival.Festival;

public class Holi implements Festival {

	@Override
	public void celebrate() {
		System.out.println("Celebrating Holi");
	}

	@Override
	public void doPooja() {
		System.out.println("Holi..");

	}


}
