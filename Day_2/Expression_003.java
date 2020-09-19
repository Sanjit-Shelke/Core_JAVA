/*
03.	Find the result of following expressions.
You need to determine the primitive data type of the variable 
by looking carefully the given expression and initialize variables 
by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]

*/


class Expression_003{
	
	public static void main(String args[])
	{   
	//A
		int x=5;
		
		int y=(x*x)+3*x-7;
	    System.out.println("A part");
		System.out.println(x);   //5
		System.out.println(y);   //33
		
	//B
		int y1=x++ + ++x;
		System.out.println("B part");
		System.out.println(x); //
		System.out.println(y1);//12
	//C
		int x2=2;
		int y2=3;
		int z= x2++ - --y2 - --x2 + x2++;
		System.out.println("C part");
		System.out.println("x=" +x2);
		System.out.println("y=" +y2);
		System.out.println("z=" +z);
	
	//D
		System.out.println("D part");
		boolean x4= true;
		boolean y4= true;
		
		boolean z4 = x4 && y4 || !(x4 || y4);
		
		System.out.println(x4);
		System.out.println(y4);
		System.out.println(z4);
		
		
	}
}