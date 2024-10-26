package com.lavanya.lesson04.abstractlesson;

public abstract class Shape {
	
	private String shapename;
	
	abstract double area();
	
	void displayShape() {
		System.out.println("This is a shape.");
	}

}
