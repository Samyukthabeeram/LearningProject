package com.pattern.learning;

public class Pattern7 {

	public static void main(String[] args) {
		int n=6;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)
			{ System.out.print("*");
		}
			System.out.println();
				
		// TODO Auto-generated method stub

	}

}
}