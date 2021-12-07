package com.pattern.learning;

public class Pattern1 {
	public static void rightAngleTriangle(int n)
	{
		for(int i=1;i<=n;i++)
		{
		for(int j=(n-1);j>=i;j--)
		{
			System.out.print(" ");
			
		}
		for(int j=1;j<=i;j++ )
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}
 public static void main(String[] args)
 { 
	 int n=7;
	 rightAngleTriangle(n);
 
} 
}
