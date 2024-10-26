package com.lavanya.lesson02.inheritance;

public class Animal {
	
	private String name;
	
	public Animal() {
		System.out.println("Hey this is me constructor super");
	}
	
	public Animal(String name) {
		this.name = name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	

}
