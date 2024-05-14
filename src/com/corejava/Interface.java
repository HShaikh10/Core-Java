package com.corejava;
/**
 * This class is used for Interface Example
 * @author Hasnain
 */
interface Drawable {
	/* static method for draw */
	void draw();

}
class Rectangle implements Drawable {
	/* method for draw rectangle */
	public void draw() {
		System.out.println("drawing rectangle");
	}

}
class Circle implements Drawable {

	/* method for draw circle */
	public void draw() {
		System.out.println("drawing circle");
	}

}
public class Interface {

	public static void main(String args[]) {
		Drawable drawable = new Circle();
		drawable.draw();
	}

}