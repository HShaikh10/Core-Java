package com.corejava;
/**
 * This class is used for Map Collection Example
 * @author Hasnain
 */
public class Shape {

	/* draw method for drawing */
	public void draw() {
		System.out.println("drawing...");
	}

}
public class Rectangle extends Shape {

	/* draw method for drawing rectangle */
	public static void draw() {
		System.out.println("drawing rectangle...");
	}

}
public class Circle extends Shape {

	/* draw method for drawing circle */
	public static void draw() {
		System.out.println("drawing circle...");
	}

}
public class Triangle extends Shape {

	/* draw method for drawing triangle */
	public static void draw() {
		System.out.println("drawing triangle...");
	}

}
public class TestPolymorphism2 {

	public static void main(String args[]) {
		Shape shape;
		shape = new Rectangle();
		shape.draw();
		shape = new Circle();
		shape.draw();
		shape = new Triangle();
		shape.draw();
	}

}