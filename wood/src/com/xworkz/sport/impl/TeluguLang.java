package com.xworkz.sport.impl;

import org.springframework.stereotype.Component;

import com.xworkz.sport.Language;
@Component("telugu")
public class TeluguLang implements Language {

	@Override
	public void communicate() {
		System.out.println("Communicating with Telugu Language");

	}

}
