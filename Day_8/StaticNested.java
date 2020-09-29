
class Outer{

    static class Foo{

        void m1()
        {
            System.out.println("Static Class");
        }
    }
}

public class StaticNested {

    public static void main(String args[])
    {
        Outer.Foo ref = new Outer.Foo();
        ref.m1();
    }
    
}
