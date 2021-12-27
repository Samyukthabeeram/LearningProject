package com.java.beginner;

import java.util.Scanner;

public class InvalidMonthNumberException extends RuntimeException
{

	public void msg()
	{
		System.out.println("month number shud be between 1 to 12");
		System.out.println("re-enter the month number");
	}



	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter month number");
		int mn=scan.nextInt();
		Cal c= new Cal();
		while(true)
		{
		try
		{
		
		c.change(mn);
				System.out.println("given month number is" +" "+ c.fetch());
				
		}
			catch(InvalidMonthNumberException r)
			{
				r.msg();
			}
		break;
		}
		
}
}