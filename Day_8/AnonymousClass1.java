
interface Talk{

    void sayHello(String name);
}

public class AnonymousClass1 {

        static void takeAction(Talk ref)
        {
            ref.sayHello("Sanjit");
        }
    public static void main(String args[])
    {
        Talk t = new Talk(){
           
            public void sayHello(String name)
            {
                System.out.println("Welcome! "+name);
            }
        };

        AnonymousClass1.takeAction(t);
    }
}
