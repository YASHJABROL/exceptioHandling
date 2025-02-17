package exceptionexample;

public class ArrayIndexBoundOutOfExceptionExample {
    public static void main(String[] args) {
        try {
            int arr[] = {12,34,2,1,245,32};
            System.out.println("arr length is :" +arr.length);
            System.out.println("arr index 2 value :" +arr[2]);
            System.out.println("arr index 6 value is :" +arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception occurred:" +e.getMessage());
        }
    }
}
