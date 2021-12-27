package com.java.beginner;

public class ExceptionClass3
{
	public static void main(String[] args) {
		System.out.println("main ends");
		 int i=4;
		 int j=6;
		 String s1="java";
		 try
		 {
			 int k=i/j;
			 System.out.println(s1.charAt(k));
		 }
		 catch(RuntimeException rv)
		 {
			 System.out.println(" this can caught faults of runtime exception");
		 }
		 System.out.println("main ends");
	}

}
  