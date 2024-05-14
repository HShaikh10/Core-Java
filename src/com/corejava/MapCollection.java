package com.corejava;
import java.util.HashMap;
/**
 * This class is used for Map Collection Example
 * @author Hasnain
 */
public class MapCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "London-England");
		hashMap.put(2, "Washington-USA");
		hashMap.put(3, "Delhi-India");
		hashMap.put(4, "Berlin-Germany");
		for (String i : hashMap.values()) {
			System.out.println(i);
		}
		System.out.println(hashMap);
	}

}