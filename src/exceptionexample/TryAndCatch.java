package exceptionexample;

public class TryAndCatch {
    public static void main(String[] args) {
        int a =10;
        int res = 0;
        try{
            System.out.println("before" );
            res = a/0;
            System.out.println("after" );
        }
        catch(ArithmeticException e)
        {
            System.out.println("Eception occured :" + e.getMessage());
        }
        System.out.println("a is:"+ a );
        System.out.println("res is:"+ res );
    }
}
