package Exceptions;


/**
 * Created by Shiva on 7/22/2017.
 */
public class StringException {

    public static void main(String[] args) {

        // String reversedString=reverse("abc");
        String reversedString = reverse("shiva");

        System.out.println(reversedString);
    }

    private static String reverse(String s) {
        if (s == null) {
            throw new NullPointerException("The string cannot be null");
        }
        StringBuilder sb = new StringBuilder(s);
        System.out.printf("Reversing string %s... \n", s);
        return sb.reverse().toString();
    }
}
