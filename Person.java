package com.utad.prueba;

public class Person {
	
	private String name;
	
	public Person(String nameArg) {
		name = nameArg;
		return self;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
