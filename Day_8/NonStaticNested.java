
class Outer{

    class Foo{
       void m1()
        {
            System.out.println("NoN Static Nested");
        }

   }
}


public class NonStaticNested {
    
    public static void main(String args[])
    {
        Outer r = new Outer();
        Outer.Foo ref = r.new Foo();
        ref.m1();
    }
}
