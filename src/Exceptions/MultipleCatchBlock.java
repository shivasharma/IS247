package Exceptions;

/**
 * Created by Shiva on 7/23/2017.
 */
public class MultipleCatchBlock {

    public static void main(String args[]) {
        String num = "234";
        int num1 = num.charAt(1);
        int num2 = num.charAt(2);

        int result = num1 + num2;
        System.out.println(num1);
        System.out.println(result);
    }
}
