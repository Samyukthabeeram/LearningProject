package com.pattern.learning;

public class Pattern20 {

	public static void main(String[] args) {
		String s="samyuktha";
		// TODO Auto-generated method stub
		for(int i=0;i<=s.length()-1;i++)
		{
			for( int j=0;j<=s.length()-1;j++)
			{
				if(i==j || i+j==8)
				{

					char a= s.charAt(j);
					System.out.print(a);
					
			}
				else 
				{ 
					System.out.print(" ");
				}
		}
System.out.println();
	}

}
}
