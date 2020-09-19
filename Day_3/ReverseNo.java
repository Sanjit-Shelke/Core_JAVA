
import java.util.Scanner;

class ReverseNo{
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your no:");
		int no=input.nextInt();
		int rev=0;
		int num=no;
		
		while (no > 0)
		{
			num = no%10;
			rev = rev*10+num;
			no = no/10;
		}
		
		System.out.println(rev);
		
	
	}
}