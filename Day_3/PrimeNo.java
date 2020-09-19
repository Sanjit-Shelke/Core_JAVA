/*
20.Print all prime numbers between two given numbers. [ break continue ]
*/
import java.util.Scanner;

class PrimeNo{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the starting no.");
		int start=sc.nextInt();
		System.out.println("Enter the End no.");
		int end =sc.nextInt();
		
		
		for (int i=start; i<= end; i++)
		{   
	        int count=0;
			for(int j=1; j<= i; j++)
			{
				if (i%j==0)
				{
					count++;
				}
			}
			
			if (count == 2)
			{
				System.out.println(i+" ");
			}
		}
	
	}
}