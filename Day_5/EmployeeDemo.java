/*
38.	Create a class Employee with three data members 
(empNo, salary and totalSalary) and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries.

*/

import java.util.Scanner;

class Employee{
	private static int empNo;
	private float salary;
	private static float totalSalary;
	
	Employee(int empNo,float salary)
	{
		this.salary=salary;
		this.empNo++;
		this.totalSalary= totalSalary+salary;
	}
	
	void show()
	{
		System.out.println("Total Employee = "+empNo);
		System.out.println("Total Salary = "+totalSalary);
	}
}

class EmployeeDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println();
		
		Employee e=new Employee(1,100.0f);
		Employee e1=new Employee(1,200.0f);
		e1.show();
		
		
	}
	
}