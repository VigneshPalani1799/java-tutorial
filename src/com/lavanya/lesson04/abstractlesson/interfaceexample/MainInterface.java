package com.lavanya.lesson04.abstractlesson.interfaceexample;

public class MainInterface {
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
		circle.display();
		Square square = new Square();
		square.display();
		square.draw();
		
		Draw draw = new Circle();
		draw.display();
		draw.draw();
		draw = new Square();
		draw.display();
		draw.draw();
		
	}

}
