package com.corejava;
public class Diamond {

	public static void main(String[] args) {
		int size = 3;
		for (int i = 1; i <= size; i++) {
			for (int j = size; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = size - 1; i >= 1; i--) {
			for (int j = size; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 2; i <= size; i++) {
			for (int j = size; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = size - 1; i >= 1; i--) {
			for (int j = size; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}