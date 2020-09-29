/*
44.	Create three classes
-	Faculty with two data members facultyId and salary and two methods, 
    one intput() method for accepting facultyId as input and another printSalary()
	to print salary.
	
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary 
    and allowance. Override input() method in this class that calls super class 
	inut() method and accepts basicSalary and allowance as input. Salary should 
	not be accepted as input but should be calculated using 
	formula (basicSalary + allowance)
	
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, 
    ratePerHour. Override input() method in this class that calls super class 
	inut() method and accepts workingHours and ratePerHour as input. Salary should
	not be accepted as input but should be calculated using formula 
	( workingHour * ratePerHour )


*/

import java.util.Scanner;

class Faculty
{
	private int facultyId;
	private int salary;
	
	void input(int Id)
	{
		this.facultyId=Id;
	}
	
	void printSalary()
	{
		System.out.println("SALARY= "+salary);
	}
}

class FullTimeFaculty extends Faculty
{
	private int basicSalary;
	private int allowance;
	
	FullTimeFaculty(int basicSalary, int allowance)
	{
		this.basicSalary=basicSalary;
		this.allowance=allowance;
		
		calFFSalary();
	}
	
	void calFFSalary()
	{
		int fsal= basicSalary+allowance;
		System.out.println("Full Time faculty salary = "+fsal);
	}
	
	void input(int fid)
	{
		super.input(fid);
	}
	
}

class PartTimeFaculty extends Faculty
{  
     private int workingHour;
	 private int ratePerHour;
	 
	 PartTimeFaculty(int workingHour, int ratePerHour)
	 {
		 this.workingHour=workingHour;
		 this.ratePerHour=ratePerHour;
		 
		 calPFSalary();
	 }
	 
	 void calPFSalary()
	 {
		int psal=this.workingHour*this.ratePerHour;
		System.out.println("Part Time Faculty salary = "+psal);
	 }
	 
	 void input(int pid)
	 {
		 super.input(pid);
	 }
	
}

class FacultyHour{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Data of fulltime Faculty: ");
		int fullid= sc.nextInt();
		System.out.println("Enter Basic Salary: ");
		int bsal= sc.nextInt();
		System.out.println("Enter Allowance: ");
		int allow= sc.nextInt();
		
		Faculty ff= new FullTimeFaculty(bsal,allow);
		ff.input(fullid);
		
		System.out.println("Enter Data of parttime Faculty: ");
		int partid= sc.nextInt();
		System.out.println("Enter Work Done Hour: ");
		int workHour = sc.nextInt();
		System.out.println("Enter rate per hour: ");
		int rtPHour= sc.nextInt();
		
		Faculty pf= new PartTimeFaculty(workHour,rtPHour);
		pf.input(partid);
		
		
	}
	
}