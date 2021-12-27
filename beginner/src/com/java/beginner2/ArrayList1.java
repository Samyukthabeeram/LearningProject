package com.java.beginner2;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(5);
		a1.add(10);
		a1.add(2.5);
		a1.add("abc");
		a1.add(null);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.contains(10));
		System.out.println(a1.get(2 ));
	}
}