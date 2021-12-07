package com.pattern.learning;

public class Pattern22 {
	public static void main(String[] args) {
		int n=8;
		int i=2;
		int j=1;
		System.out.print(i);
		System.out.print(j);
		for(int x=1; x<=n-2;x++)
		{
			int k=i+j;
			System.out.print(k);
			i=j;
			j=k;
		}
	} 
	
	}

