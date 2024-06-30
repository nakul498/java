package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig") //no need if we using @bean
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean
	public Student getStudent() {
		
		// creating  a new Student object
		Student student = new Student(getSamosa());
		
		return student;
		
	}
}
