/*
11.Write a program to swap two numbers without using third variable.
*/

import java.util.Scanner;

class Swap_11{
	
	public static void main (String args[])
	{
		Scanner swp= new Scanner(System.in);
		int num1=swp.nextInt();
		int num2=swp.nextInt();
		System.out.println("Before swapping: Num1= "+num1+" Num2= "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;

		System.out.println("After swapping: Num1= "+num1+" Num2= "+num2);
	}
}