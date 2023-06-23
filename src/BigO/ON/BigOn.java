package BigO.ON;

public class BigOn {
    public static void main(String[] args) {
        printItems(100);
        System.out.println("--------------------");
        singleWhileLoop(100);
        ifStatement(87);
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

    public static void ifStatement(int n) {
        // in this case either if or else will execute based on the input
        // if the value of n doubles it will take double to execute in
        if (n % 2 == 0) { //this is 0(1) how??
            System.out.println("The input is even");
        } else {
            for (int i = 0; i < n; i++) { //0(n)??
                System.out.print("Printing " + i);
            }
        }
    }
}
