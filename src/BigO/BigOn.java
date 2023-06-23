package BigO;

public class BigOn {
    public static void main(String[] args) {
        printItems(10);
    }

    private static void printItems(int n) {
        /**This code is o(n)
         * n is 10 and did 10 operations
         */
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
