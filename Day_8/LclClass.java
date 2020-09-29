
class Outer{

    void m1()
    {
        class A{
            void m2()
            {
                System.out.println("Nested Local Class");
            }
        }

        A r = new A();
        r.m2();
    }
}

public class LclClass{

    public static void main(String args[])
    {
        Outer o = new Outer();
        o.m1();
    }
    
}
