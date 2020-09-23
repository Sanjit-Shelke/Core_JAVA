/*
33.	Write a program to demonstrate functionalities of 
this keyword in java. 
*/

import java.util.Scanner;
class KeyDemo{
	private int empId;
	private String empName;
	
	void set(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
    void show()
	{
		System.out.print("Id = "+empId+ "\nName = "+empName);
	}
	
}
class ThisKey{
	
	public static void main(String args[])
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.println();
		
		KeyDemo k = new KeyDemo();
		k.set(88,"Sanjit");
		k.show();
	}
	
}