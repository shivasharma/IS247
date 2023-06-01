package Exceptions;

public class StringParser {

    public static void main(String[] args) {
        String name = "Shiva Sharma";
        int i = Integer.parseInt(name);

        System.out.println(i);

        //Integer.parseInt(name) method returns the integer value which is represented by the argument in decimal equivalent
        // int i = Integer.parseInt("20"); This code will not throw error
    }
}
