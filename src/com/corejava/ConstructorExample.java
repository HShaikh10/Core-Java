package com.corejava;
import java.util.Scanner;
/**
 * This class is used for Constructor
 * @author Hasnain
 */
public class ConstructorExample {

		/* The Constructor example methos is for defining integer a and b */
		public ConstructorExample() {
		Scanner scanner = new Scanner(System.in);	
		int a;
		System.out.println("Enter First Number: ");
		a = scanner.nextInt();
		int b;
		System.out.println("Enter Second Number: ");
		b = scanner.nextInt();
		scanner.close();
	}

	int total;	
	/* The add method do addition on variable a and b */
	public void add() {
		total = a + b;
	}

	/*  The add method display addition of variable a and b */
	public void display() {
		System.out.println("Total of a and b is: " + total);
	}

	public static void main(String[] args) {
		ConstructorExample constructorExample = new ConstructorExample();
		constructorExample.add();
		constructorExample.display();
	}

}