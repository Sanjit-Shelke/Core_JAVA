/*
21.	Program to show sum and average of 10 element array. 
Accept array elements from user. 
*/


import java.util.Scanner;

class SumOfArray{
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
		
		for(int i= 0 ;i<arr.length; i++)
		{
			System.out.println("Enter element in array");
			arr[i]=input.nextInt();
		}
		
		int sum=0;
		
		for(int i= 0 ;i<arr.length; i++)
		{
			sum=sum+arr[i];
			
		}
		
		int avg= sum/arr.length;
		
		System.out.println("Sum of Array Elements= "+sum);
		System.out.println("Average of Array Elements= "+avg);
		
		
		
	}
}