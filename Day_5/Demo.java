/*
35.	Create a class MathOperation that has four static methods.
add() method that takes two integer numbers as parameter and 
returns the sum of the numbers. subtract() method that takes 
two integer numbers as parameter and returns the difference of
 the numbers. multiply() method that takes two integer numbers
as parameter and returns the product. power() method that 
takes two integer numbers as parameter and returns the power 
of first number to second number. 
*/

import java.util.Scanner;

class MathOperation{
	
	static void add(int x, int y)
	{
		int a=x+y;
		System.out.println(+x+" + "+y+" = "+a);
	}
	
	static void subtract(int x ,int y)
	{
		int s=x-y;
		System.out.println(+x+" - "+y+" = "+s);
	}
	
	static void multiply(int x ,int y)
	{
		int m=x*y;
		System.out.println(+x+" X "+y+" = "+m);
		
	}
	
	static void power(int x ,int y)
	{
		 
		double p= (Math.pow(x, y));
		System.out.println(+x+"^"+y+" = "+p);
	}
	
}

class Demo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st No.");
		int x=sc.nextInt();
		System.out.println("Enter 2nd No.");
		int y=sc.nextInt();
		
		MathOperation.add(x,y);
		MathOperation.subtract(x,y);
		MathOperation.multiply(x,y);
		MathOperation.power(x,y);
		
	}
	
}