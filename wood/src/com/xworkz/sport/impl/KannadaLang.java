package com.xworkz.sport.impl;

import org.springframework.stereotype.Component;

import com.xworkz.sport.Language;
@Component("kannada")
public class KannadaLang implements Language {

	@Override
	public void communicate() {
		System.out.println("Communicating with Kannada Language");
	}

}
