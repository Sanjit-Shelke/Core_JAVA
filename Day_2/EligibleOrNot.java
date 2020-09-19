/*
15.	Accept person’s gender (character m for male and f for female), 
age (integer), as input and then check whether person is 
eligible for marriage or not.
*/

import java.util.Scanner;

class EligibleOrNot{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Gender");
		String gen= input.next();
		
		System.out.println("Enter Your Age");
		int age= input.nextInt();
		
		if( gen.equals("m") || gen.equals("M") && age >= 21) 
		{
			System.out.println("You are eligible");
		}
		else if( gen.equals("f") || gen.equals("F") && age >= 18)
		{
			System.out.println("You are eligible");
		}
		else
		{
			System.out.println("You are Not Eligible");
		}
	}
}