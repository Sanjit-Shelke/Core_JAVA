/*
46.	Create a program to demonstrate the use of instanceof operator or secure 
reference down casting.

*/

import java.util.Scanner;

class Person {
	
	void getDetail()
	{
		System.out.println("Person Detail");
	}
	
	void getJob()
	{
		System.out.println("Person Job");
	}
}

class Employee extends Person{
	
	void getJob()
	{
		System.out.println("Employee Job");
	}
	
	void getDept()
	{
		System.out.println("Employee Dept");
	}
}

class InstanceOf{
	
	public static void main(String args[])
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.println();
		
		Person ar[]={ new Employee(),new Person()};
		
		for(Person a:ar )
		{
			if(a instanceof Employee)
			{
				Employee e =(Employee)a;
				e.getDept();
			}
		}
	}
	
}