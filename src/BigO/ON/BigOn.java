package BigO.ON;

public class BigOn {
    public static void main(String[] args) {
        printItems(100);
        System.out.println("--------------------");
        singleWhileLoop(100);
    }

    private static void printItems(int n) {
        /**This code is o(n)
         * n is 10 and did 10 operations
         * The complexity of this operation is O(n).
         * The operations change linearly with the size of the input
         */
        long now = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Time taken by for loop:" + (System.currentTimeMillis() - now));
    }

    public static void singleWhileLoop(int n) {
        long now = System.currentTimeMillis();
        int i = 0;
        while (i < n) { // if the input n is increases the time will increase
            System.out.print(i);
            i++;
        }
        System.out.println();
        System.out.println("Time taken by while loop:" + (System.currentTimeMillis() - now));
    }
}
