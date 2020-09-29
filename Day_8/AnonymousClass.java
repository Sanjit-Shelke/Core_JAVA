
interface Talk{

    void sayHello( String name);

}

class TalkImple implements Talk{

    public void sayHello( String name)
    {
        System.out.println("WelCome !!" +name);
    }
}

public class AnonymousClass {
    static void takeAction( Talk ref)
    {
        ref.sayHello("Sanjit");
    }

    public static void main(String args[])
    {
        Talk t = new TalkImple();

        AnonymousClass.takeAction(t);
    }
    
}
