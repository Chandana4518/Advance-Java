package com.xworkz.store.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrackerDTO implements Serializable{
	
	private int price;
	private String brand;
	private String name;
	private String color;
	private int length;
	
	

}
