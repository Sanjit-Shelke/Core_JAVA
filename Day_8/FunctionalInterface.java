interface Foo{

    void m1();
}

class Bar implements Foo{

    public void m1()
    {
        System.out.println("From Functional Interface");
    }
}


public class FunctionalInterface {
    
    public static void main(String args[])
    {
        Bar b= new Bar();
        b.m1();
    }
}
