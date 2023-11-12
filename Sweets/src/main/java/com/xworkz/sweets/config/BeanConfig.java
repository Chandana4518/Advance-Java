package com.xworkz.sweets.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan("com.xworkz.sweet")
@EnableWebMvc
public class BeanConfig implements WebMvcConfigurer{
	
	public BeanConfig()
	{
		System.out.println("Generating beans in Config class...");
	}
	@Bean
	public  ViewResolver viewResolve()
	{
		return new InternalResourceViewResolver("/",".jsp");
		
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	registry.addRedirectViewController("/", "Shop.jsp");
		 
	}

}
