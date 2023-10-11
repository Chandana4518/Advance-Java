package com.xworkz.tree.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.tree.dto.PlayerDTO;
import com.xworkz.tree.dto.PlayerSport;

public class PlayerRunner {

	public static void main(String[] args) {
		PlayerDTO dto = new PlayerDTO(1, "Rohit Sharma", "India", PlayerSport.CRICKET, 36);
		PlayerDTO dto1 = new PlayerDTO(2, "Gill", "India", PlayerSport.CRICKET, 24);
		PlayerDTO dto2 = new PlayerDTO(3, "Virat Kohli", "India", PlayerSport.CRICKET, 34);
		PlayerDTO dto3 = new PlayerDTO(4, "Kuldeep", "India", PlayerSport.CRICKET, 26);
		PlayerDTO dto4 = new PlayerDTO(5, "Hardik Pandya", "India", PlayerSport.CRICKET, 30);
		PlayerDTO dto5 = new PlayerDTO(6, "Cristiano Ronaldo", "Portugal", PlayerSport.FOOTBALL, 38);
		PlayerDTO dto6 = new PlayerDTO(7, "Lionel Messi", "Argentina", PlayerSport.FOOTBALL, 36);
		PlayerDTO dto7 = new PlayerDTO(8, "Neymar", "Brazil", PlayerSport.FOOTBALL, 31);
		PlayerDTO dto8 = new PlayerDTO(9, "Robert Lewandowski", "Poland", PlayerSport.FOOTBALL, 32);
		PlayerDTO dto9 = new PlayerDTO(10, "Wayne Gretzky", "Cannada", PlayerSport.HOCKEY, 30);
		PlayerDTO dto10 = new PlayerDTO(11, "Connor McDavid", "Cannada", PlayerSport.HOCKEY, 34);
		PlayerDTO dto11 = new PlayerDTO(12, "Maurice Richard", "Cannada", PlayerSport.HOCKEY, 36);
		PlayerDTO dto12 = new PlayerDTO(13, "Kodai Naraoka", "Japan", PlayerSport.SHETTLE, 31);
		PlayerDTO dto13 = new PlayerDTO(14, "Prannoy H.S", "India", PlayerSport.SHETTLE, 29);
		PlayerDTO dto14 = new PlayerDTO(15, "Shi Yu Qi", "China", PlayerSport.SHETTLE, 32);
		PlayerDTO dto15 = new PlayerDTO(16, "Li Shi Feng", "China", PlayerSport.SHETTLE, 41);
		PlayerDTO dto16 = new PlayerDTO(17, "Decock", "South Africa", PlayerSport.CRICKET, 35);
		PlayerDTO dto17 = new PlayerDTO(18, "Smith", "Australia", PlayerSport.CRICKET, 36);
		PlayerDTO dto18 = new PlayerDTO(19, "Warner", "Australia", PlayerSport.CRICKET, 34);
		PlayerDTO dto19 = new PlayerDTO(20, "Afridi", "Pakisthan", PlayerSport.CRICKET, 28);

		Collection<PlayerDTO> collection = new HashSet<PlayerDTO>();

		collection.add(dto);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		collection.add(dto11);
		collection.add(dto12);
		collection.add(dto13);
		collection.add(dto14);
		collection.add(dto15);
		collection.add(dto16);
		collection.add(dto17);
		collection.add(dto18);
		collection.add(dto19);
		Collection<PlayerDTO> collection2 = new HashSet<PlayerDTO>();
		collection.forEach((a) -> {
			if (a.getCountry().equals("India")) {
				System.out.println("Players in India :" + a.getName());
				collection2.add(a);
			} 
		});
		collection2.forEach((b) -> {
			System.out.println(b.getName());
		});
		
		Collection<PlayerDTO> collection3=new HashSet<PlayerDTO>();
		collection.forEach((c)->{
			if(c.getSport().equals(PlayerSport.CRICKET))
			{
				System.out.println("Cricket Players :" +c.getName());
				collection3.add(c);
			}
		});
		collection3.forEach((d)->{
			
		System.out.println(d.getName());
		});
		Collection<PlayerDTO> collection4=new HashSet<PlayerDTO>();
		collection.forEach((e)->{
			if(e.getAge()>20&&e.getAge()<30)
			{
				System.out.println("Player Names who is greater than 20 and less than 30 :" +e.getName());
			collection4.add(e);
			}
		});
		collection4.forEach((f)->{
			
			System.out.println(f.getName());
			});
		Collection<PlayerDTO> collection5=new HashSet<PlayerDTO>();
		collection.forEach((g)->{
			if(g.getAge()>30)
			{
				System.out.println("Player Names who is greater than 30 :" +g.getName());
			collection5.add(g);
			}
		});
		collection5.forEach((h)->{
			
			System.out.println(h.getName());
			});
		Iterator<PlayerDTO> iterator=collection.iterator();
		
		while(iterator.hasNext())
		{
			PlayerDTO ele=iterator.next();
			System.out.println(ele.getName());
			if(ele.getAge()>40)
			{
				System.out.println("Age Greater than 40 :" +ele.getName());
				iterator.remove();
			}
		}
		collection.forEach((i)->{
			System.out.println(i.getName());
		});
		
		
	}

}
