package exceptionexample;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try{
            String msg1 = "hi hello";
            String msg2 = null;
            System.out.println("length of msg1:"+msg1.length());
            System.out.println("length of msg1:"+msg2.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception occured:"+e.getMessage());
        }
    }
}
