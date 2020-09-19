/*
10.	Write a program to convert temperature from Fahrenheit to Celsius.
Take Fahrenheit as input using Scanner class. 
[ formula : C= 5*(f-32)/9 ]
*/

import java.util.Scanner;

class Temperature{
	
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Farenheit :");
		
		double farh=input.nextDouble();
		
		double celsius= 5*(farh-32)/9;
		
	
	System.out.println("Temperature in Celsius= " +String.format("%.2f",celsius));
	
	}
}
