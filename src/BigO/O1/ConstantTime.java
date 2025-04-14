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

/*

 <table class="min-w-full" data-start="1645" data-end="2069"><thead data-start="1645" data-end="1714"><tr data-start="1645" data-end="1714"><th data-start="1645" data-end="1659">Method</th><th data-start="1659" data-end="1677">Time Complexity</th><th data-start="1677" data-end="1714">Reason</th></tr></thead><tbody data-start="1786" data-end="2069"><tr data-start="1786" data-end="1856"><td class="max-w-[calc(var(--thread-content-max-width)*2/3)]" data-start="1786" data-end="1800"><code data-start="1788" data-end="1795">sum()</code></td><td class="max-w-[calc(var(--thread-content-max-width)*2/3)]" data-start="1800" data-end="1819">O(1)</td><td class="max-w-[calc(var(--thread-content-max-width)*2/3)]" data-start="1819" data-end="1856">Simple arithmetic + return</td></tr><tr data-start="1857" data-end="1927"><td class="max-w-[calc(var(--thread-content-max-width)*2/3)]" data-start="1857" data-end="1871"><code data-start="1859" data-end="1868">array()</code></td><td class="max-w-[calc(var(--thread-content-max-width)*2/3)]" data-start="1871" data-end="1890">O(n)</td><td class="max-w-[calc(var(--thread-content-max-width)*2/3)]" data-start="1890" data-end="1927">Because of loop through array</td></tr><tr data-start="1928" data-end="1998"><td class="max-w-[calc(var(--thread-content-max-width)*2/3)]" data-start="1928" data-end="1942">Array index</td><td class="max-w-[calc(var(--thread-content-max-width)*2/3)]" data-start="1942" data-end="1961">O(1)</td><td class="max-w-[calc(var(--thread-content-max-width)*2/3)]" data-start="1961" data-end="1998">Direct access by index</td></tr><tr data-start="1999" data-end="2069"><td class="max-w-[calc(var(--thread-content-max-width)*2/3)]" data-start="1999" data-end="2013"><code data-start="2001" data-end="2013">constant()</code></td><td class="max-w-[calc(var(--thread-content-max-width)*2/3)]" data-start="2013" data-end="2032">O(1)</td><td class="max-w-[calc(var(--thread-content-max-width)*2/3)]" data-start="2032" data-end="2069">Single assignment</td></tr></tbody></table>
*/
