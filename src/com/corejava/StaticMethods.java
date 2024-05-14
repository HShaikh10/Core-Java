package com.corejava;
/**
 * This class is used for Static Methods Example
 * @author Hasnain
 */
public class StaticMethods {

	public static int x = 10;
	public static int y;
	/* Static method for function */
	public static void func(int z) {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}
	/* Static method for print */
	public static void {
		System.out.println("Running static initialization block.");
		y = x + 5;
	}
	public static void main(String args[]) {
		func(8);
	}

}