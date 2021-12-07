package com.day22.learning;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
makeSound(new  Lion());
makeSound(new Tiger());
	}
	public static void makeSound(Animal a1)
	{
		a1.noise();
	}
}
