/*
25.	Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.
*/
import java.util.Scanner;

class SumEvenOdd{
	
	public static void main(String args[])
	{
		int arr[]= {12,10,9,6,2};
		int even=0;
		int odd=0;
		
		for(int i=0; i < arr.length; i++)
		{
			if(arr[i]%2 == 0)
			{
				even=even+arr[i];
			}
			else
			{
				odd=odd+arr[i];
				
			}
			
		}
		System.out.println("Sum of Even no.= "+even);
		System.out.println("Sum of Odd no.= "+odd);
	}
}