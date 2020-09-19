/*
23.	Write a program to reverse the array elements.
*/
import java.util.Scanner;

class ReverseArray{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i < arr.length;i++)
		{    
	        System.out.println("Enter your No.");
			arr[i]=sc.nextInt();
		}
		
		int last = arr.length-1;
		for(int i=0; i<arr.length/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[last];
			arr[last]= temp;
		}
		
		for(int i: arr){
			System.out.print(i);
		}	
	}
}