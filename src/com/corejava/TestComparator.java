package com.corejava;
import java.util.ArrayList;
import java.util.Collections;
/**
 * This class is used for Comparator Example
 * @author Hasnain
*/
public class TestComparator {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Mumbai");
		arrayList.add("Ahmedabad");
		arrayList.add("Delhi");
		arrayList.add("Udaypur");
		Collections.sort(arrayList);
		System.out.println("List is sorted in reversed order");
		System.out.println(arrayList);
	}

}