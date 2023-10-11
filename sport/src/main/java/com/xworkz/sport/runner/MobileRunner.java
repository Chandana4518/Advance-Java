package com.xworkz.sport.runner;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class MobileRunner {

	public static void main(String[] args) {
		Collection<Long> collection = new HashSet<Long>();
		collection.add(9890573996L);
		collection.add(9390792007L);
		collection.add(8790292247L);
		collection.add(9963270442L);
		collection.add(9963664432L);
		collection.add(9390777192L);
		collection.add(8739473369L);
		collection.add(9937428764L);

		System.out.println("Total Mobile Numbers :" + collection.size());
		boolean a = Collections.addAll(collection,9867547554L);
		System.out.println("addAll :" + a);
		boolean b = collection.isEmpty();
		System.out.println("isEmpty :" + b);
		Iterator<Long> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Long ele = iterator.next();
			System.out.println("Mobile Numbers :" + ele);

		}
		boolean c = collection.remove(9963270442L);
		System.out.println("remove :" + c);
		
		Collection<Integer> collection2=new HashSet<Integer>();
		collection2.add(3);
		collection2.add(4);
		collection2.add(5);
		collection2.add(6);
		collection2.add(7);
		System.out.println("Collection :" +collection2);
		boolean d = collection.removeAll(collection2);
		System.out.println("removeAll :" + d);
		boolean e = collection.contains(9890573996L);
		System.out.println("contains :" + e);
		boolean f = collection.containsAll(collection2);
		System.out.println("containsAll :" + f);

		boolean g = collection.retainAll(collection2);
		System.out.println("retainAll :" + g);

	}

}
