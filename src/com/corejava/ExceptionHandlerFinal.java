package com.corejava;
import java.util.Scanner;
/**
 * This class is used for Exception Handler using Final Example
 * @author Hasnain
 */
public class ExceptionHandlerFinal {

	public static void main(String[] args) {
		int a[] = new int[2];
		System.out.println("out of try");
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Access invalid element: " + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds.");
		} finally {
			System.out.println("Finally block is always executed.");
		}
		scanner.close();
	}

}