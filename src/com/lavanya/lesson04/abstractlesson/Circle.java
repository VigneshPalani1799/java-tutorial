package com.lavanya.lesson04.abstractlesson;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public double area() {
		return Math.PI * radius * radius;
	}

}
