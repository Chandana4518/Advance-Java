package com.xworkz.tree.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO implements Serializable{
	
	private int id;
	private String name;
	private String country;
	private PlayerSport sport;
	private int age;
	

}
