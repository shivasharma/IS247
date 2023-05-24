package Exceptions;

/**
 * Created by Shiva on 7/22/2017.
 */

public class CheckedException {

    public static void main(String[] args) {


        String reversedString = reverse(null);

        System.out.println(reversedString);
    }

    private static String reverse(String s) {
        if (s == null) {
            try {
                throw new Exception("The string cannot be null");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        StringBuilder sb = new StringBuilder(s);
        System.out.printf("Recversing string %s... \n", s);
        return sb.reverse().toString();

        // return reversedString;
    }
}


