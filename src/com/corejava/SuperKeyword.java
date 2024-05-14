package com.corejava;
/**
 * This class is used for Super Keyword Example
 * @author Hasnain
 */
public class Bird {

	/* method for bird sound */
	public void birdSound() {
		System.out.println("Bird make sound");
	}

}
public class Pigeon extends Bird {

	/* method for bird sound using Super keyword */
	public void birdSound() {
		super.birdSound();
		System.out.println("Pigeon sound");
	}

}
	public class SuperKeyword {

		public static void main(String[] args) {
		Bird bird = new Bird();
		bird.birdSound();
	}

}