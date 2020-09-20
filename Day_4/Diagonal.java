/*
30.	Create an integer type 2-D array of size [3X3]. 
Take the elements from the user and then calculate the 
sum of the elements present in the diagonal.
*/
 
 //System.out.println();
import java.util.Scanner;

class Diagonal{
	
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
			
			for(int j=0; j< arr[i].length ; j++)
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
		
		int dl=0;
		int dr=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(i==j)
				{	
				   dr=dr+arr[i][j];
				}
				
			}
			
			for(int j=arr[i].length ; j >=0; j--)
			{
				if(i+j == arr[i].length-1)
				{					
					dl = dl+arr[i][j];
				}
			}
			
		}
		 System.out.println("Right Diagonal Sum= "+dr);
		 System.out.println("Left Diagonal Sum= "+dl);
		//System.out.println("Left Diagonal Sum= "+dl);
		//System.out.println("Right Diagonal Sum= "+dr);
	}
}