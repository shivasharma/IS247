package Recursion;

public class MyNumberSumRec {

    int sum = 0;

    public static void main(String a[]) {
        MyNumberSumRec mns = new MyNumberSumRec();
        System.out.println("Sum is: " + mns.getNumberSum(1234));
    }

    public int getNumberSum(int number) {

        if (number == 0) {
            return sum;
        } else {
            int result = number % 10;
            sum = sum + (number % 10);
            getNumberSum(number / 10);
        }
        return sum;
    }
}
