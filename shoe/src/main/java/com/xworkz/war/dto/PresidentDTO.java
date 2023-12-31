package com.xworkz.war.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@	Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PresidentDTO implements Comparable<PresidentDTO>{
	private int id;
	private String name;
	private int age;
	private LocalDate durationStart;
	private LocalDate durationEnd;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PresidentDTO other = (PresidentDTO) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
		
	}
	@Override
	public int compareTo(PresidentDTO args) {
		PresidentDTO current=this;
		return current.getName().compareTo(args.getName());
	}


}

