package com.xworkz.sport.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class VegetableDTO implements Serializable{
	
	private int id;
	private String name;
	private double price;
	private double weight;

}
