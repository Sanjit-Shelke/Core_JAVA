/*
Default interface in JAVA
*/

interface Foo{
	
	default void m1()
	{
		System.out.println("Default Interface");
	}
}

class Bar implements Foo{

}

class DefaultInterface{

	public static void main(String args[])
	{ 
		Bar b = new Bar();
		b.m1();

	}
}