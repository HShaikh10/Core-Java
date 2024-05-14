package com.corejava;
import java.util.Scanner;
/**
 * This class is used for IF-Else Example
 * @author Hasnain
 */
public class IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();		
		if (age >= 18) {
			System.out.println("Age is 18+ years");
		} else {
			System.out.println("Age is less than 18 years ");
		}
		scanner.close();
	}

}