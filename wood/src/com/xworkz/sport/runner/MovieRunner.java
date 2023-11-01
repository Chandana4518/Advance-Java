package com.xworkz.sport.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.sport.Movie;
import com.xworkz.sport.config.MovieConfig;
import com.xworkz.sport.impl.Bollywood;

public class MovieRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
		Movie movie = context.getBean(Bollywood.class);
		movie.promote();
	}

}
