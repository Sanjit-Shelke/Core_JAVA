
import java.util.Scanner;

class Table{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which table you want:");
		int table= sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int ans=i*table;
			System.out.println(table+" X "+i+ " = " +ans);
		}
	}
}