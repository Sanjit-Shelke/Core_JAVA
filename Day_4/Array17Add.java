/*
26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements.
*/
import java.util.Scanner;

class Array17Add{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ROW size");
		int r=sc.nextInt();
		int arr[][]=new int[r][];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter COLUMN size for "+i);
			int c=sc.nextInt();
			arr[i]=new int[c];
		
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter value");
				arr[i][j]=sc.nextInt();
			}
	    }
		
		int sum=0;
		for(int ar[]: arr)
		{
			for(int a: ar)
			{
				sum=sum+a;
				System.out.print(" "+a);
			}
			System.out.println(" ");
		}
		System.out.println("Sum = "+sum);
		
	}
	
	
}