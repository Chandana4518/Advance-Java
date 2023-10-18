package com.xworkz.map.dto;

import java.io.Serializable;
import java.time.LocalDate;

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
public class PassportDTO implements Serializable{
	
	private int id;
	private String no;
	private LocalDate issuedDate;
	private String issuedBy;
	private LocalDate expiryDate;
	private PassportDTOType type;

}
