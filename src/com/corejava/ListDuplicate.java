package com.corejava;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * This class is used for Duplicate element in List Example
 * @author Hasnain
 */
public class ListDuplicate {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("E");
		arrayList.add("B");
		System.out.println(arrayList.toString());
		Set<String> set = new LinkedHashSet<String>(arrayList);
		System.out.println(set);
	}

}