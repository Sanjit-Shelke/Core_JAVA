/*
30.	Create an integer type 2-D array of size [3X3]. 
Take the elements from the user and then calculate the 
sum of the elements present in the diagonal.
*/
 
 //System.out.println();
import java.util.Scanner;

class demo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row size:");
		int r=sc.nextInt();
		
		int arr[][]=new int[r][];
		
		for(int i=0 ; i< arr.length ;i++ )
		{
			System.out.println("Enter the size of Column:");
			int c=sc.nextInt();
			arr[i]=new int[c];
			
			for(int j=0; j< arr[i].lenght ; j++)
			{
				System.out.println("Enter Element:");
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int ar[] :arr)
		{
			for(int a: ar)
			{
				System.out.print(" "+a);
			}
			System.out.println(" ");
	    }
	}
}