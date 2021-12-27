package com.java.beginner;

public class ExceptionClass2 
{
public static void main(String[] args) {
	System.out.println("main starts");
	int i=10;
	int j=2;
	String s= "java";
	try
	{
		int k=i/j;
		System.out.println(s.charAt(k));
	}
	catch(ArithmeticException rv)
	{
		System.out.println("Artithmetic exception is caught and recovered");
	}
	catch(StringIndexOutOfBoundsException sv)
	{
		System.out.println("String IndexOutOfBounds Exception is caught and recovered");
	}
	System.out.println("main ends");
}
}
