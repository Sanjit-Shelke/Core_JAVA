/*
Marker interface
*/
interface Foo{
	
	static void m1()
	{
		System.out.println("Static Interface Marker");
	}
}

class Marker{
	
	public static void main(String args[])
	{
		Foo.m1();
	}
}