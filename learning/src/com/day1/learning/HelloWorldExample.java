package com. day1.learning;

public class HelloWorldExample {
public static void main(String[] args) {
	/*
	 * System is a class - java.lang package - which is by default included.
	 * out - static field variable which returns PrintStream Class object
	 * println - method in PrintStream class which belongs to java.io package => anything which has () is a method
	 */
	System.out.println("Hello Word!.");
	
	HelloWorldExample object=new HelloWorldExample();
	System.out.println(object.calculateSumOfTwoNumbers(10, 20));
	System.out.println(object.calculateSumOfTwoNumbers(1,2, 3));
}
// ONe of the example of Poly - Many Mor - Units - Phism - Behvaiour
int calculateSumOfTwoNumbers(int number1, int number2){
	
	return number1+number2;
}
int calculateSumOfTwoNumbers(int number1, int number2,int number3){
	
	return number1*number2*number3;
}
}
