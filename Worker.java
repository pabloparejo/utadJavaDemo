package com.utad.prueba;

public class Worker extends Person {
	
	private String company;
	
	public Worker(String companyArg, String nameArg) {
		self = super(nameArg);
		self.name = nameArg;
		return self;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
