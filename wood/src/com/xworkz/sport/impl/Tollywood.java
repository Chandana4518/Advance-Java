package com.xworkz.sport.impl;

import org.springframework.stereotype.Component;

import com.xworkz.sport.Movie;
@Component
public class Tollywood implements Movie {

	@Override
	public void produce() {
		System.out.println("Produce in Tollywood movie");

	}

	@Override
	public void promote() {
		System.out.println("Promote in Tollywood movie");

	}

	@Override
	public void release() {
		System.out.println("Release Tollywood movie on 12th Nov");

	}

}
