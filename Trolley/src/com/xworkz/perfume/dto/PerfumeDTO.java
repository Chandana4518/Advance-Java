package com.xworkz.perfume.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class PerfumeDTO implements Serializable{
	
	private String name;
	private int price;
	private String originalCountry;
	private int quantity;
	private String smell;

}
