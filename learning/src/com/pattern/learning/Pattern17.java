package com.pattern.learning;

public class Pattern17 {
public static void main(String[] args) {
	String s="java";
	for(int i=0;i<=s.length()-1;i++)
	{
		for( int j=0;j<=s.length()-1;j++)
		{
			if(i>=j)
			{

				char a= s.charAt(j);
				System.out.print(a);
		}
	}
		System.out.println();
}
}
} 
 