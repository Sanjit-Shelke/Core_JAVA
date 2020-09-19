/*
09.	Write a program to read the days (eg. 670 days) as integer value using
Scanner class. Now convert the entered days into complete years, months and days and print them.
*/

import java.util.Scanner;

class Convert_Day_09
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Days");
		int numb=sc.nextInt();
		
		int countyr=0;
		int countmnth=0;
		int countday=0;
		
		while(numb>=365)
		{
			numb=numb-365;
			countyr++;
		}
		while(numb>=30)
		{
			numb=numb-30;
			countmnth++;
		}
		
		System.out.println("Year= " +countyr+ " Month= " +countmnth+ " Days="+numb);
				
	}
}

