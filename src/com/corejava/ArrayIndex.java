package com.corejava;
import java.util.Scanner;
/**
 * This class is used for Array Index Number
 * @author Hasnain
 */
public class ArrayIndex {

	/* Static method for index number with parameters */
	public static int indexNumber(int array[], int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number for IndexNumber: ");
		int element = scanner.nextInt();
		int array[] = { 1, 2, 3, 4, 5, 6 };
		int index = indexNumber(array, element);
		if (index != -1) {
			System.out.println("Index of " + element + " in the array is: " + index);
		} else {
			System.out.println("Element not found in the array.");
		}
		scanner.close();
	}

}