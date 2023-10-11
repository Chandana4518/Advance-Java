package com.xworkz.tree.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO implements Serializable{
	
	private int id;
	private String name;
	private MovieLanguage language;
	private String producer;
	private String director;
	private Long budget;

}
