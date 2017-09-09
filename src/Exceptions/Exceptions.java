package Exceptions;

/**
 * Created by Shiva on 6/24/2017.
 */
public class Exceptions {
    //It compiles fine, but it throws ArithmeticException when run.
    // The compiler allows it to compile, because ArithmeticException is an unchecked exception.
    public static void main(String[] args) {
        int i = 12;
        int j = 2;

        try {
            int result = i / (j - 2);
            System.out.println(result);


        } catch (ArithmeticException e) {
            System.out.println("Error" + e.getMessage());

            //This line will show exactly what went wrong
            e.printStackTrace();
        }

    }
}
