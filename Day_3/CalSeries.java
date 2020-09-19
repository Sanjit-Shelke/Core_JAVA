/*
19.	Calculate  series : 12+22+32+42+.........+n2
*/

import java.util.Scanner;

class CalSeries{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the end no of series");
		int end=sc.nextInt();
		
		int x=12;
		int y=12;
		
		System.out.print(x);
		for(int i=1;i<end;i++)
		{
			x=x+10;
			System.out.print(" + "+x);
            y=y+x;
		}
		
		System.out.println("\n Sum Of Series = " +y);		
	}
}