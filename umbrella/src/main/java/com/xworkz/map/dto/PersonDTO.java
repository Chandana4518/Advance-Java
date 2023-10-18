package com.xworkz.map.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO implements Serializable{
	
	private int id;
	private String name;
	private String email;
	private long mobile;
	
	

}
