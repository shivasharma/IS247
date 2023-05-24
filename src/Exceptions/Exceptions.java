package Exceptions;

/**
 * Created by Shiva on 6/24/2017.
 */
public class Exceptions {

    public static void main(String[] args) {
        int i = 12;
        int j = 2;

        try {
            int result = i / (j - 2);
            System.out.println(result);


        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            System.out.println("Error" + e + " cannot divide by zero");
            //This line will show exactly what went wrong
            e.printStackTrace();
        }

    }
}
