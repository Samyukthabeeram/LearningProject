package com.pattern.learning;

public class PatternA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i, j;
		 int n=7;
		  for (i = 1; i <= n; i++) {
	            for (j = 1; j <= ( 2*n); j++) {
	              
		 if ((i+n ) > j)
             System.out.print(" ");
         else
             System.out.print("*");
     } System.out.println();
      
	}

	}
}
