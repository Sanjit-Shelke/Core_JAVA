/*
37.	Create a class Person with properties (name and age) with 
following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.

*/

import java.util.Scanner;

class Person{
	
	private String name;
	private int age;
	
	Person()
	{
		this.age = 18;
	}
	
	void set(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void set(String name)
	{
		this.name=name;
	}
	
	void show()
	{
		System.out.println("Name= "+name+"\nAge= "+age);
	}
	

}

class PersonDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Person p=new Person();
		p.set("Sanjit",88);
		p.show();
		
		Person p1=new Person();
		p1.set("Sidd");
		p1.show();
	}
	
}