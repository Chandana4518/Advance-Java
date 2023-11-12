package com.xworkz.festival.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FestivalDTO implements Serializable{
	
	private String festivalName;
	private int noOfDays;
	private String season;
	private String date;
	
	

}
