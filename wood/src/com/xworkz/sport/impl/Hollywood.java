package com.xworkz.sport.impl;

import org.springframework.stereotype.Component;

import com.xworkz.sport.Movie;

@Component
public class Hollywood implements Movie {

	@Override
	public void produce() {
		System.out.println("Produce in Hollywood movie");

	}

	@Override
	public void promote() {
		System.out.println("Promote in Hollywood movie");

	}

	@Override
	public void release() {
		System.out.println("relese Hollywood movie on 24th Dec");

	}

}
