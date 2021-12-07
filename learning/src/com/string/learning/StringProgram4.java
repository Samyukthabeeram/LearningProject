package com.string.learning;

public class StringProgram4 {
	public static void main(String[] args) {
		String s="samyuktha";
		String s1="praveen";
		if(s==s1)
		{ 
			StringBuilder sb=new StringBuilder(s1);
		sb.reverse();
		System.out.println(sb);
		}
		else if(s!=s1)
		{
			System.out.println(s1);
			
		}
		else{
			System.out.println(s);
		}
	}

}
