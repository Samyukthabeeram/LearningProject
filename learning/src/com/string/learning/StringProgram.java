package com.string.learning;

public class StringProgram
{ 
	private String name = "samyuktha";
	private String name2= "praveen";
	public static void main(String[] args)
	{
		StringProgram s= new StringProgram();
		System.out.println(s.name);
		System.out.println(s.name2);
		System.out.println(s.name.charAt(2));
		System.out.println(s.name.codePointBefore(9));
		System.out.println(s.name.concat("reddysony"));
	System.out.println(s.name.equals(s.name2));
	System.out.println(s.name2.endsWith("a"));
	System.out.println(s.name.isEmpty());
	}
	}



