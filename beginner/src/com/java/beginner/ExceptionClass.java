package com.java.beginner;

import java.util.Scanner;

public class ExceptionClass {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("starts");
		scan = new Scanner(System.in);
		System.out.println("enter numerator value");
		int i = scan.nextInt();
		System.out.println("enter denomenator value");
		int j = scan.nextInt();
		while (true) {
			try {
				double k = i / j;
				System.out.println(k);
				break;
			} catch (ArithmeticException AE) {
				System.out.println("denominator cannot be zero. Re-enter the value");
				j = scan.nextInt();
			}
		}
		System.out.println("ends");

	}

}
