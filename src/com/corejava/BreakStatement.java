package com.corejava;
import java.util.Scanner;
/**
 * This class is used for Break Statement
 * @author Hasnain
 */
public class BreakStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value;
		boolean conditionMet = false;
		for (int i = 0; i <= 10; i++) {
			System.out.println("Enter Value for Break Statement");
			value = scanner.nextInt();
			if (value == 0) {
				conditionMet = true;
				break;
			}
		}
		if (conditionMet) {
			System.out.println("Loop exited due to condition being met.");
		} else {
			System.out.println("Loop completed without meeting the condition.");
		}
		scanner.close();
}

}