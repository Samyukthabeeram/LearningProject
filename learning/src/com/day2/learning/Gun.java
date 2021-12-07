package com.day2.learning;
public class Gun {
String gName;
int bullets;
public void fire()
{
	System.out.println( "use bullets for firing");
}

}


 class Battle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gun G1= new Gun();
		Gun G2= new Gun();
		G1.gName = "pistol";
		G1.bullets = 4;
		G2.gName = "Ak47";
		G2.bullets = 20;
		G1.fire();
		G2.fire();
				{

	}
}
}
