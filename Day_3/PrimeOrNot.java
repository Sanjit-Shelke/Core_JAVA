/*
18.	Program to check whether number is prime or not.
*/
import java.util.Scanner;

class PrimeOrNot{
	
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Your No.");
		int num=input.nextInt();
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if (num%i==0)
			{
				count++;
			}
		}
		
		if (count==2)
		{
			System.out.println(num+" is Prime no.");
		}
		else
		{
			System.out.println(num+ " is not Prime no.");
		}
	
	}
}