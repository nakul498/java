package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("firststudent") // no need in case we use @bean
public class Student {
	
	private Samosa samosa;
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.display();
		System.out.println("student is reading book");
	}
}
