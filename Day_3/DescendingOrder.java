/*
22.	Sort a ten element array in descending order.
*/
import java.util.Scanner;
import java.util.Arrays;

class DescendingOrder{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]= new int[10];
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter a number");
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println("Array in Descending Order");
		
		for(int i=(arr.length)-1; i >= 0 ; i--)
		{
			System.out.print(" "+arr[i]);
			
		}
	
	}
}