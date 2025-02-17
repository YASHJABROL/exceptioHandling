package exceptionexample;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("inside try block");
            int a = 10;
            int res = a / 10;
            System.out.println("res is:" + res);
            String msg1 = "hi";
            String msg2 = "t";
            System.out.println("msg1 length is :" + msg1.length());
            System.out.println("msg2 length is :" + msg2.length());
            int arr[] = {23, 12, 14};
            System.out.println("length of array a is :" + arr.length);
            System.out.println("a index 5 is :" + arr[5]);
            System.out.println("After try block");
        } catch (ArithmeticException e) {
            System.out.println("exception occured :" + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("exception occured :" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception occured :" + e.getMessage());
        }
    }
}