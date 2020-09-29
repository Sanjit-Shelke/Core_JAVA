
interface Mylogic{

    boolean test(int num);
}

class ArrayOpe{

    static void showArray(int ar[],Mylogic ref)
    {
        for(int a : ar)
        {
            if (ref.test(a))
            {
                System.out.print(a+" ");
            }
          

        }
        System.out.println(" ");
    }
}


public class FunctionProg1 {

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        ArrayOpe.showArray(arr,(int n)-> {return true;});
        ArrayOpe.showArray(arr,(n)-> {return n%2 == 0;});
        ArrayOpe.showArray(arr, (n)-> n%2 !=0);
        ArrayOpe.showArray(arr, n-> n%2 != 0);
    }
    
}
