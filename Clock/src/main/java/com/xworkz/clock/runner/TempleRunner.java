package com.xworkz.clock.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.clock.dto.TempleDTO;

public class TempleRunner {

	public static void main(String[] args) {
		
			
			TempleDTO dto=new TempleDTO("Hanuman","Atp","Hanuman",1999,"Gopi");
			TempleDTO dto1=new TempleDTO("Krishna","Blg","Krishna",1989,"Amar");
			TempleDTO dto2=new TempleDTO("Venkateswara","Btm","Venkateswara",2000,"Adithya");
			
			Collection<TempleDTO> collection=new HashSet<TempleDTO>();
			collection.add(dto);
			collection.add(dto1);
			collection.add(dto2);
			
			System.out.println("Total Temples :" +collection.size());
			
			for(TempleDTO temple:collection)
			{
				System.out.println(temple.getName());
			}
			Iterator<TempleDTO> iterator=collection.iterator();
			
			while(iterator.hasNext())
			{
				TempleDTO ele=iterator.next();
				System.out.println(ele.getName());
				
				if(ele.getName().equals("Krishna"))
				{
					iterator.remove();
				}
			}
		}

	}


