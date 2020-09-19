/*
06.	Write a program that takes radius of a circle as input. 
Read the entered radius using Scanner class.
Then calculate and print the area and circumference of the circle.
*/

import java.util.Scanner;

class Radius_of_Circle{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double radius = input.nextDouble();
		
		double result=Math.PI*(Math.pow(radius,2));
		System.out.println(result);
			

	}
}