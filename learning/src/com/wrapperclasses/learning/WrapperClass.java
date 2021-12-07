package com.wrapperclasses.learning;

import java.io.File;
import java.io.FileInputStream;

public class WrapperClass {
	public void callMe(){
		
		System.out.println("In the Loop");
		callMe();
	}
	public static void main(String[] args) {
		WrapperClass obj= new WrapperClass();
		System.out.println("THis is testing for git push ");
		for(;;){
			obj.callMe();
		}
		
		
	}
}
		
		 /*   int a = 8;
		    int iAge = 12;
			    double b = 5.65;
			    float c =5.2f;
			  Integer aObj =a;
			  Integer d=null;
			  File f=new File("");
			//  FileInputStream fis = new FileInputStream(new File(""));
			  System.out.println(d.intValue());
			  
			    Double bObj = Double.valueOf(b);

			    if(aObj instanceof Integer) {
			      System.out.println("An object of Integer is created.");
			    }

			    if(bObj instanceof Double) {
			      System.out.println("An object of Double is created.");
			    }
			  }
			}
*/