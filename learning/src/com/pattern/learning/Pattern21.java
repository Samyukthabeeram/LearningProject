package com.pattern.learning;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=7;j++)
	{ 
		if(i==j || i+1==j || i+j==7|| i+j==8)
		{
			System.out.print("*");
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
