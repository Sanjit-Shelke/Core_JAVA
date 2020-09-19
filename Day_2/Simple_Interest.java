/*
08.	Write a program to find the simple interest. 
Take the principle amount,
rate of interest and time from user using Scanner class.
*/

import java.util.Scanner;

class Simple_Interest{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		double result=(p*r*n)/100;
		
		System.out.println("Simple Interest is= "+result);
	}
}