/*
27.	Write a program to fine the smallest and greatest number present
in the array of integer type.
*/

import java.util.Scanner;

class SmallestGreatestNo{
	
	public static void main(String args[])
	{
		int arr[]={2,8,6,4,5};
		
		int small=arr[0];
		int large=arr[0];
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]< small)
				{
					small=arr[i];
				}
				else if(arr[i] > large)
				{
					large = arr[i];
				}
			
		}
		
		System.out.println("Largest no.= "+large);
		System.out.println("Smallest no.="+small);
	
	}
}