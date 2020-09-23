/*
41.Write a program to demonstrate this() construct functionality
*/

import java.util.Scanner;

class This{
	 This(){
		this(10);
		System.out.println("This is a Non-Parametrised Constructor");
		}

	This(int i){
		this(20,30);
		System.out.println("This is a Parametrised Constructor");
		}
	
	This(int a,int b){
	System.out.println(a+" "+b);
		}


	}

class ThisDemo{
	public static void main(String args[])
	{
		This t = new This();
	}
	
	}