/*
24.	Write a program to search an element in the array.
*/

import java.util.Scanner;

class FindInArray{
	
	public static void main(String args[])
	{
		int arr[]={10,20,30,30,50};
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Element you want to search");
		int inp= input.nextInt();

		for(int i=0 ;i < arr.length; i++)
		{
			if(arr[i] == inp)
			{
			 System.out.println("Element Found at index= "+i);
			} 	
		}
	}
}