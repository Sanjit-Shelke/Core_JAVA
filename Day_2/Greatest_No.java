/*
13.	Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  
*/

import java.util.Scanner;

class Greatest_No{
	
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter 1st no:");
		int a = input.nextInt();
		
		System.out.println("Enter 2nd no:");
		int b = input.nextInt();
		
		System.out.println("Enter 3rd no:");
		int c = input.nextInt();
		
		int Larger= (a > b)? ( (a > b) ? a : b ) : ((b > c)? b : c);
		
		System.out.println("Largest no: " +Larger);
	}
}
