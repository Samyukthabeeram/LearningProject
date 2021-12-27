package com.java.beginner;

public class ExceptionClass1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		try
		{
		display();
		}
		catch(InterruptedException rv)
		{
			System.out.println("exception is caught and recovered");
		}
	}
public static void display() throws InterruptedException
{
	System.out.println("display starts");
	for(int i=0;i<=5;i++)
	{
		System.out.println("i=" + i); 
		Thread.sleep(i);
	}
	System.out.println("display ends");
}

}
