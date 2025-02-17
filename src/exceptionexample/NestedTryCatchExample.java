package exceptionexample;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try
        {
            System.out.println("inside 1st try block");
            int a = 10;
            int res = a / 10;
            System.out.println("res is:" + res);
            try
            {
                System.out.println("inside 2nd try block");
                String msg1 = "hi";
                String msg2 = "t";
                System.out.println("msg1 length is :" + msg1.length());
                System.out.println("msg2 length is :" + msg2.length());
                try
                {
                    System.out.println("inside 3nd try block");
                    int arr[] = {23, 12, 14};
                    System.out.println("length of array a is :" + arr.length);
                    System.out.println("a index 5 is :" + arr[5]);
                }
                catch(Exception e) {
                    System.out.println("inside 3nd catch block");
                System.out.println("exception occured :" + e.getMessage());
            }
            }
            catch(Exception e) {
                System.out.println("inside 2nd catch block");
                System.out.println("exception occured :" + e.getMessage());
            }
        }
        catch(Exception e) {
            System.out.println("inside 1nd catch block");
            System.out.println("exception occured :" + e.getMessage());
        }
    }
}
