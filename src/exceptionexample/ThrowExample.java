package exceptionexample;

public class ThrowExample {
    public static void sample()
    {
        System.out.println("sample method before throwing an exception");
        int a = 10;
        if(a==10)
        {
            throw new RuntimeException("some exception occurred");
        }
        System.out.println("a is:"+a);
    }

    public static void main(String[] args) {
        try{
            ThrowExample.sample();
        }
        catch (Exception e)
        {
            System.out.println("exception occurred :" +e.getMessage());
        }
    }
}
