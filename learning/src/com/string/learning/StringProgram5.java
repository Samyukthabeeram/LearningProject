package com.string.learning;

public class StringProgram5 {
	public static void main(String[] args) {
		 String s= "java";
		 String s1= "coding";
		 if(s!=s1)
		 { StringBuffer SB= new StringBuffer(s);
		 SB.append(s1);
		 System.out.println(SB);
		 }
		 else
		 {
			 System.out.println(s1);
		 }
	
}

}
