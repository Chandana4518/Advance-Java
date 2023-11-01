package com.xworkz.festival.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.festival.Festival;
import com.xworkz.festival.app.Christmas;
import com.xworkz.festival.app.Diwali;
import com.xworkz.festival.app.Dussehra;
import com.xworkz.festival.app.GaneshaFestival;
import com.xworkz.festival.app.Holi;
import com.xworkz.festival.app.Krishnashtami;
import com.xworkz.festival.app.Moharam;
import com.xworkz.festival.app.Navaratri;
import com.xworkz.festival.app.Onam;
import com.xworkz.festival.app.Sankranti;
import com.xworkz.festival.app.config.FestivalConfig;

public class FestivalRunner {

	public static void main(String[] args) {
		
	ApplicationContext context=	new AnnotationConfigApplicationContext(FestivalConfig.class);
	Festival fest= context.getBean(Dussehra.class);
	fest.celebrate();
	fest.doPooja();
	System.out.println();
	Festival fest1= context.getBean(Christmas.class);
	fest1.celebrate();
	fest1.doPooja();
	System.out.println();
	Festival fest2= context.getBean(Diwali.class);
	fest2.celebrate();
	fest2.doPooja();
	System.out.println();
	Festival fest3= context.getBean(GaneshaFestival.class);
	fest3.celebrate();
	fest3.doPooja();
	System.out.println();
	Festival fest4= context.getBean(Holi.class);
	fest4.celebrate();
	fest4.doPooja();
	System.out.println();
	Festival fest5= context.getBean(Krishnashtami.class);
	fest5.celebrate();
	fest5.doPooja();
	System.out.println();
	Festival fest6= context.getBean(Moharam.class);
	fest6.celebrate();
	fest6.doPooja();
	System.out.println();
	Festival fest7= context.getBean(Navaratri.class);
	fest7.celebrate();
	fest7.doPooja();
	System.out.println();
	Festival fest8= context.getBean(Onam.class);
	fest8.celebrate();
	fest8.doPooja();
	System.out.println();
	Festival fest9= context.getBean(Sankranti.class);
	fest9.celebrate();
	fest9.doPooja();
	
	}

}
