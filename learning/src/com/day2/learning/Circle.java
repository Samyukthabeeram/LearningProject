package com.day2.learning;

public class Circle {
	int r;
	static double pi=3.14;
	Circle(int a)
	{
		this.r=a;
	}
public void getArea()
{
	double res= pi*this.r*this.r;
	System.out.println("area of circle" + res);
}
public void getCircumference()
{
	double res = 2*pi*this.r;
	System.out.println("circumference of a circle"+res);
}
}
