package com.corejava;
import java.util.Scanner;
/**
 * This class is used for Continue Statement
 * @author Hasnain
 */
public class ContinueStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i <= 10; i++) {
			System.out.println("Enter 0 to continue or any other number to print the current number: ");
			int userInput = scanner.nextInt();
			if (userInput == 0) {
				continue;
			}
			System.out.println(i);
		}
		scanner.close();
	}

}