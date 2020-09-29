/*
 50.Explain the importance of toString() and equals() method of the Object class 
    and override them on class Employee(empId,name,salary).  
 a. Create class for main method(say XYZ),and accept five employees information and store in an array. 
    Also ensure if entered empId already exist or not (use equals method).  
 b. Display all employee info using toString method.
 */



package day9;

import java.util.Scanner;

class Employee{
	public int empid;
	private String name;
	private float salary;
	
	public Employee(int empId,String name,float salary)
	{
		this.empid = empId;
		this.name = name;
		this.salary = salary; 
		
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee e = (Employee)obj;
		return empid == e.empid;
	}
	
	
	
}

public class ImpStringEquals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size Of Array: ");
		int n= sc.nextInt();
		
		Employee arr[] = new Employee[n];
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("Enter Employee Id: ");
			int empid= sc.nextInt();
			
			for(int j=0;j<i;j++)
			{
				System.out.println(arr[j].empid);
				if( empid ==arr[j].empid) 
				{
					System.out.println("Alreay Exists");
					break;
				}
			}
			
			System.out.println("Enter Employee name: ");
			String ename=sc.next();
			
			System.out.println("Enter Employee salary: ");
			float sal= sc.nextFloat();
			
			Employee e = new Employee(empid, ename, sal);
			arr[i]= e;
			
		}
		
		for(Employee e : arr)
		{
			System.out.println(e);
		}

	}

}
