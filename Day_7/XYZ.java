/*
49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. 
create abstract method calcTax().

a. Create class Employee(empId,name,salary) and implement Taxable to 
 calculate incomeTax on yearly salary. 
b. Create class Product(pid,price,quantity) and implement Taxable to 
 calculate salesTax on unit price of product. 
c. Create class for main method(Say XYZ), accept employee information and a 
  product information from user and print income tax and sales tax respectively.

*/

import java.util.Scanner;

interface Taxable{
	
	float salesTax= 7f;
	float incomeTax= 10.5f;
	
	void calcTax();
	
}


class Employee implements Taxable{
	private int empId;
	private String name;
	private float salary;
	
	Employee(int empId,String name, float salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	public void calcTax()
	{
		System.out.println("Employee Income Tax= "+((incomeTax/100)*salary));
	}
	
	
}

class Product implements Taxable{
	private int pid;
	private float price;
	private int quantity;
	
	Product(int pid,float price,int quantity)
	{
		this.pid = pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	public void calcTax()
	{
		System.out.println("Sales Tax= "+((salesTax/100)*price));
	}
}

class XYZ{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Information: ");
		System.out.println("Enter Employee Id:");
		int empId= sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String name=sc.next();
		System.out.println("Enter Employee Salary: ");
		float salary=sc.nextFloat();
		
		Employee e= new Employee(empId,name,salary);
		e.calcTax();
		
		System.out.println("\nEnter Product Details: ");
		System.out.println("Enter Product Id: ");
		int pid=sc.nextInt();
		System.out.println("Enter Price: ");
		float price=sc.nextFloat();
		System.out.println("Enter Quantity: ");
		int quant= sc.nextInt();
		
		Product p=new Product(pid , price , quant);
		p.calcTax();
		
	}
	
}