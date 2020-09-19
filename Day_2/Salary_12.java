/*
12.In a company an employee is paid as under: If his basic salary
 is less than Rs. 10000, 
 then HRA = 10% of basic salary and DA = 90% of basic salary. 
 If his salary is either equal to or above Rs. 10000, 
 then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary. 
[formula : GS= Basic + DA + HRA ]
*/

import java.util.Scanner;

class Salary_12{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Salary");
		float sal= sc.nextInt();
		
		if(sal < 10000)
		{
			float hra = 0.10F * sal;
			float da = 0.90F *sal;
			
			float GrossSalary= sal+hra+da;
			System.out.println("Gross Salary = "+GrossSalary);
			
		}
		else 
		{
			float hrag= 2000;
			float dag= 0.98f * sal;
			
			float grossSalaryG= sal+hrag+dag;
			System.out.println("Gross Salary = "+grossSalaryG);
		}

	}
}
