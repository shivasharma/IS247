public class Main {
    // A generic method
   // <T> before the return type indicates that this is a generic method.
  //The method printArray can accept an array of any type (Integer, String, etc.).
    
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};

        // Call the generic method with Integer array
        printArray(intArray);

        // Call the generic method with String array
        printArray(strArray);
    }
}
