package BigO.O1;

public class ConstantTime {
    /**
     * what is the time complexity
     * a=1 b =1 total =a+b(1+1) return time =1
     * total operation =a+b+total+return 1+1+1+1=4 O(4) ==> O(1) =Constant time
     */
    public static int sum(int a, int b) {
        // how many times this line is executed
        int total = a + b;
        // how many times this line is executed
        return total;
    }

    public static void array() {
        // how many times this line is executed
        int[] arr = {1, 2, 3, 4, 5};
        // asking  for index 4
        System.out.println(arr[4]); //O(1)
    }

    public static void constant() {
        int a = 10;// O(1);
    }

    public static void main(String[] args) {
        int sum = sum(10, 20);
        System.out.println(sum);
        array();

    }
}
