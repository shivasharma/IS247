package BigO.ON;

public class BigOn {
    public static void main(String[] args) {
        printItems(1000);
    }

    private static void printItems(int n) {
        /**This code is o(n)
         * n is 10 and did 10 operations
         * The complexity of this operation is O(n).
         * The operations change linearly with the size of the input
         */
        long now = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        System.out.println("Time taken by ArrayList:" + (System.currentTimeMillis() - now));
    }
}
