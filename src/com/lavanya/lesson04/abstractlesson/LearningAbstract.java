package com.lavanya.lesson04.abstractlesson;

public class LearningAbstract {
	
	public static void main(String[] args) {
		Shape shape = new Square(15);
		System.out.println(shape.area());
		
		shape = new Circle(10);
		
		System.out.println(shape.area());
		
		Square square = new Square(10);
		System.out.println(square.area());
		
		Circle circle = new Circle(20);
		System.out.println(circle.area());
		
	}

}
