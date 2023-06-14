package Recursion;

public class Recursion {


    public static void main(String[] args) {

        int[] numberList = {10, 20, 30, 40, 50};

        System.out.println();
        // reduceByOne(50000);
        reduceByOneUsingLoop(500000);
        //reversePrint(numberList);
    }

    public static void reduceByOne(int n) {
        //base case checking condition
        if (n >= 0) {
            reduceByOne(n - 1); //recursion function
        }
        System.out.println("Completed call using rec:" + n);
    }


    private static void reversePrint(int[] numbers) {
        //check for a length of numbers which is a basecase
        if (numbers.length == 0) return;

        //take out first element and reverse the numbers list
        int[] a = new int[numbers.length - 1];
        //check the length -1 of a number but not unit end
        //skip first element and move rest into new array
        System.arraycopy(numbers, 1, a, 0, numbers.length - 1);
        //recursive method
        reversePrint((a));

        System.out.println(numbers[0] + " ");

    }


    public static void reduceByOneUsingLoop(int j) {
        //base case checking condition
        long now = System.currentTimeMillis();
        if (j >= 0) {

            int count = 0;
            while (count < j) {
                count += 1;
                System.out.println("Completed call " + count + " using loop");
            }

            System.out.println("Loop is completed in millisec " + (System.currentTimeMillis() - now));

        }
    }
}
