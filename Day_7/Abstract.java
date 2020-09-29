/*
48.	Create an Abstract class Processor with int member variable data  
and method showData to display data value. 
Create abstract method process() to define processing of member data. 
Create a class  Factorial using abstract class Processor  to calculate 
and print factorial of a number by overriding the process method.
b. Create a class Circle using abstract class Processor to calculate 
and print area of a circle by overriding the process method.
Ask user to enter choice (factorial or circle area).  
Also ask data to work upon. Use Processor class reference to achieve 
this mechanism.

*/

import java.util.Scanner;

abstract class Processor{
	int data;
	
	void showData()
	{
		System.out.println("Result= "+data);
	}
	
	abstract void process(int no);
}

class Factorial extends Processor{
	int result=1;
	
	void process(int no1)
	{
		for(int i= no1 ;i>0; i--)
		{
			result=result*i;
		}
		
		data=result;
	}
}

class Circle extends Processor{
	
	void process(int no2)
	{
	int area=(int)(Math.PI*(Math.pow(no2,2)));
	data = area;
	}
	
}

class Abstract{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while(true){
		  System.out.println("Choose from following option: \n1. Factorial\n2.Area Of Circle\n3.Exit");
		  int choice=sc.nextInt();
		
			     if(choice == 1)
				 {
					 System.out.println("Enter Factorial no.");
		             int no1=sc.nextInt();
		
		             Processor fact= new Factorial();
		             fact.process(no1);
		             fact.showData();
				 }
				 else if(choice == 2)
				 {
					System.out.println("Enter Radius of circle");
		            int no2=sc.nextInt();
		
		            Processor rad= new Circle();
		            rad.process(no2);
		            rad.showData();
				 }
				 else if(choice == 3)
				 {
					 System.exit(0);
				 }
				 else{
					 System.out.println("Invalid Choice");
				 }
		}		 
	}
		
}
	
