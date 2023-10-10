package com.xworkz.guest.functional;


public class FunctionalTest {
	public static void main(String[] args) {

		Newspaper newspaper = (a1) -> {
			if (a1.equals("TOI")) {
				return 8;
			} else if (a1.equals("DC")) {
				return 5;
			} else if (a1.equals("HT")) {
				return 4;
			}
			return 0;
		};

		Tyre tyre = (a, b, c) -> {
			if (a.equals("MRF") && (b == 15) && (c.equals("TWO"))) {
				return 1300;
			}
			if (a.equals("MRF") && (b == 17) && (c.equals("TWO"))) {
				return 1500;
			}
			if (a.equals("TVS") && (b == 12) && (c.equals("TWO"))) {
				return 900;
			}
			return 0;
		};

		Iphone iphone = () -> {
			return true;
		};

		call(newspaper, "DC");
		call(newspaper, "TOI");
		call(newspaper, "HT");

		wait(tyre, "MRF", 15, "TWO");
		wait(tyre, "MRF", 17, "TWO");
		wait(tyre, "TVS", 12, "TWO");
		
		phone(iphone);
	}

	static void call(Newspaper newspaper, String agency) {
		System.out.println("Running call method...");
		double check = newspaper.priceByAgency(agency);
		System.out.println("Check :" + check);
	}

	static void wait(Tyre tyre, String brand, int size, String type) {
		System.out.println("Running wait method...");
		double save = tyre.getPrice(brand, size, type);
		System.out.println("Save :" + save);
	}

	static void phone(Iphone iphone) {
		System.out.println("Running phone method..");
		boolean store = iphone.looksGod();
		System.out.println("Store :" + store);
	}


}
