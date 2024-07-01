package BigO.O1;

public class ConstantTime {
    /**
     * what is the time complexity
     * a=1 b =1 total =a+b(1+1) return time =1
     * total operation =a+b+total+return 1+1+1+1=4 O(4) ==> O(1) =Constant time
     * NOTE
     * 11 3 23 7
     * if you delete a value in the beginning of the array it is O(n) because you have reindex it
     * if you add a value in the middle of the array it is an O(n)
     *  if you delete a value at the end it is O(1)
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

        for (int element : arr) {//O(n) find a value 5 for array
            if (element == 5) {
                System.out.println(element);
                //return true;
            }
        }


    }

    public static void constant() {
        int a = 10;// O(1);
    }

    public static void main(String[] args) {
        int sum = sum(10, 20);
        // System.out.println(sum);
        array();

    }
}
