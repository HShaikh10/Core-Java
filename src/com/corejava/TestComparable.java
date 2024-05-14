package com.corejava;
import java.util.ArrayList;
import java.util.Collections;
/**
 * This class is used for Comparable Example
 * @author Hasnain
 */
public class Sample implements Comparable<Sample> {

	private double rating;
	private String name;
	private int year;
	/* method for compare variable */
	public int compareTo(Sample m) {
		return this.year - m.year;
	}

	/* method for compare variables */
	public Sample(String newName, double newRate, int newYear) {
		this.name = newName;
		this.rating = newRate;
		this.year = newYear;
	}

	public double getRating() {
		return rating;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
}
public class Main {

	public static void main(String[] args) {
		ArrayList<Sample> arrayList = new ArrayList<Sample>();
		arrayList.add(new Sample("Sample", 9, 2010));
		arrayList.add(new Sample("Sample2", 10, 2005));
		Collections.sort(arrayList);
		System.out.println("after sorting");
		for (Sample movie : arrayList) {
			System.out.println(movie.getName() + " " + movie.getYear() + " " + movie.getRating() + " ");
		}
	}

}