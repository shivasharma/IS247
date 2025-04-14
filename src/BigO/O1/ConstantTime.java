package BigO.O1;

public class ConstantTime {

    /**
     * Time Complexity: O(1) - Constant Time
     *
     * Explanation:
     * - a = 1 → 1 operation
     * - b = 1 → 1 operation
     * - total = a + b → 1 operation
     * - return total → 1 operation
     * => Total operations = 4 ⇒ O(4) → simplified to O(1)
     *
     * NOTE:
     * - Array values: [11, 3, 23, 7]
     *   - Deleting a value at the **start** → O(n) (need to shift/reindex)
     *   - Inserting in the **middle** → O(n) (shift elements)
     *   - Deleting at the **end** → O(1) (no shifting)
     */
    public static int sum(int a, int b) {
        // Executes once → O(1)
        int total = a + b;
        return total; // O(1)
    }

    public static void array() {
        // O(1): Creating the array
        int[] arr = {1, 2, 3, 4, 5};

        // O(1): Direct access by index
        System.out.println(arr[4]);

        // O(n): Loop through array to find a value
        for (int element : arr) {
            if (element == 5) {
                System.out.println(element);
                // Could return true here
            }
        }
    }

    public static void constant() {
        int a = 10; // O(1)
    }

    public static void main(String[] args) {
        int sum = sum(10, 20); // O(1)
        array(); // Runs above logic
    }
}
