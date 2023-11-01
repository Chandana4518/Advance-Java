package com.xworkz.sport.impl;

import org.springframework.stereotype.Component;

import com.xworkz.sport.Language;
@Component("hindi")
public class Hindi implements Language {

	@Override
	public void communicate() {
		System.out.println("Communicating with Hindi Language");

	}

}
