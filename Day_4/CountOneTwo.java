/*
29.	Write a program to print the total number of one-D arrays in a two-D array and the number of elements 
in every one-D array present in the two-D arrays.
*/


import java.util.Scanner;

class CountOneTwo{
	
	public static void main(String args[])
	{
		int a[]={1,2,3,4};
		int b[]={5,6,7};
		
		int c[][]= new int[2][];
		c[0]=a;
		c[1]=b;
		
		System.out.println("Length of 2-d array= " +c.length);
			
		for(int i=0; i<c.length; i++)
		{
			int count=0;
			for(int j=0; j< c[i].length;j++)
			{
				count++;
			}
			System.out.println("Length of 1-D "+ i +" array= "+count);
		    
		}
		
	
	}
	
}