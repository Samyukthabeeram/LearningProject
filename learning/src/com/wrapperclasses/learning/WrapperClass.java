package com.wrapperclasses.learning;

public class WrapperClass {

	public static void main(String[] args) {
		    int a = 8;
			    double b = 5.65;
			  Integer aObj =a;
			    Double bObj = Double.valueOf(b);

			    if(aObj instanceof Integer) {
			      System.out.println("An object of Integer is created.");
			    }

			    if(bObj instanceof Double) {
			      System.out.println("An object of Double is created.");
			    }
			  }
			}
