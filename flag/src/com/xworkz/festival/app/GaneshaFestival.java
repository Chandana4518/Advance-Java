package com.xworkz.festival.app;

import com.xworkz.festival.Festival;

public class GaneshaFestival implements Festival {

	@Override
	public void celebrate() {
		System.out.println("Celebrating GaneshaFestival");
	}

	@Override
	public void doPooja() {
		System.out.println("GaneshaFestival..");

	}
 

}
