package BigO.ON2;

public class ON2 {
    /*
       Complexity is based on  worst case secnario
       if a single loop of n is O(n), two nested loops will be higher complexity
       when the value of n changes, each loop takes longer to iterate
       if n was 1 then it is 1*1  if n is 2 2*2
       For every iteration of outer loop the inner loop iterate n times
       n*n

           /
    //Time Complexity:
    First loop: O(n²) (same nested loop as above)
    Second loop: O(n)
    Combined: O(n² + n)
    Big O Simplified: Drop the smaller term → O(n²)


   nestedForLoop(n)	O(n²)	Classic nested loop
   nestedForLoopAndNonNested(n)	O(n²)	O(n² + n) simplifies to O(n²)
   nestedForLoophalfdivide(n)	❌ Infinite loop	Due to incorrect loop condition


    
     */


    
    public static void main(String[] args) {
        nestedForLoop(2);
    }

    public static void nestedForLoop(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Product of %s and %s is %s%n", i, j, i * j);

            }
        }
    }

    public static void nestedForLoopAndNonNested(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { //O(n2)
                System.out.printf("Product of %s and %s is %s%n", i, j, i * j);

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("printing" + i); //O(n)
        }

        // if we add O(n2+n)=> O(n2)
        //The lower order terms are ignored. Only the higher order terms is kept
    }


    public static void nestedForLoophalfdivide(int n) {
        //N*(N/2)=O(N2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j--) {
                System.out.printf("Value of i: %s j: %s%n", i, j);

            }
        }
    }

}
