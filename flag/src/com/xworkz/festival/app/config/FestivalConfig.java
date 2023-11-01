package com.xworkz.festival.app.config;

import org.springframework.context.annotation.Bean;

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

public class FestivalConfig {
	@Bean
	public Dussehra getDussehra() {
		return new Dussehra();
	}

	@Bean
	public Diwali getDiwali() {
		Diwali diwali = new Diwali();
		return diwali;
	}

	@Bean
	public Christmas getChristmas() {
		return new Christmas();
	}

	@Bean
	public GaneshaFestival getGaneshaFestival() {

		return new GaneshaFestival();
	}

	@Bean
	public Holi getHoli() {
		return new Holi();
	}

	@Bean
	public Krishnashtami getKrishnashtami() {

		return new Krishnashtami();
	}

	@Bean
	public Moharam getMoharam() {
		return new Moharam();
	}

	@Bean
	public Navaratri getNavaratri() {

		return new Navaratri();
	}

	@Bean
	public Onam getOnam() {
		return new Onam();
	}

	@Bean
	public Sankranti getSankranti() {

		return new Sankranti();
	}

}
