/*
47.	Create a program to demonstrate constructor chaining.

*/

import java.util.Scanner;
class CHAIN1{
	
	CHAIN1()
	{
		System.out.println("1ST CHAIN");
		
	}
	
	CHAIN1(int i)
	{
		System.out.println("3RD CHAIN");
	}
	
}
class CHAIN2 extends CHAIN1{
	
	CHAIN2()
	{
		super();
		System.out.println("2ND CHAIN");
	}
	
	CHAIN2(int i)
	{
		super(i);
		System.out.println("4TH CHAIN");
	}
}

class Chaining{
	
	public static void main(String args[])
	{
		CHAIN2 e = new CHAIN2();
		
		CHAIN2 e1 = new CHAIN2(12);
	}
	
}