package Collections;

public class ArrayLimitation {
    public static void main(String[] args) throws Exception {
        String num = "234";
        char num1 = num.charAt(1);
        char num2 = num.charAt(2);
        int result = num1 + num2;
        System.out.println(num1);
        System.out.println(result);


        char ch = '3';
        char ch1 = '4';
        int ascii = ch;
        int result1 = (ch + ch1);
        // You can also cast char to int
        int castAscii = result1;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
