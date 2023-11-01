package com.xworkz.sport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.sport.Language;
import com.xworkz.sport.Movie;

@Component
public class Bollywood implements Movie {

	@Autowired
	@Qualifier("telugu")
	private Language language;

	@Override
	public void produce() {
		System.out.println("Produce in Bollywood movie");

	}

	@Override
	public void promote() {
		System.out.println("Promote in Bollywood movie");
		language.communicate();

	}

	@Override
	public void release() {
		System.out.println("Release Bollywood movie on 30th Aug");

	}

}
