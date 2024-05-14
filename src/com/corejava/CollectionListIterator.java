package com.corejava;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * This class is used for Collection List Iteraor Example
 * @author Hasnain
 */
public class CollectionListIterator {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add("$Test");
		arrayList.add("Gujarat");
		Iterator<String> stringIterator = arrayList.iterator();
		System.out.println(stringIterator.next());
	}

}