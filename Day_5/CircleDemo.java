/*
34.	Create a class Circle that has two data members, 
one to store the radius and another to store area and 
three methods first init() method to input radius from user, 
second calculateArea() method to calculate area of circle and 
third display() method to display values of radius and area. 
Create class CircleDemo ( main class) that creates the Circle 
object and calls init(), calculateArea() and display() methods.
*/

import java.util.Scanner;

class Circle{
	private double radius;
	private double area;
	
	void init(double radius)
	{
		this.radius=radius;
	}
	
	void calculateArea()
	{
		area=Math.PI*(Math.pow(radius,2));	
	}
	
	void display()
	{
		System.out.println("Area of circle= "+ String.format("%.3f",area));
	}
}

class CircleDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of circle=");
		double r=sc.nextDouble();
		
		Circle c = new Circle();
		c.init(r);
		c.calculateArea();
		c.display();
	}
	
}