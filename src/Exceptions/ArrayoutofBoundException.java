package Exceptions;

public class ArrayoutofBoundException {

    public static void main(String[] args) {
        System.out.println("Element of the array");
        int[] ar = {1, 2, 3};
        for (int i = 0; i <= ar.length; i++) {
            System.out.println(ar[i]);
        }
        //What will happen to this print statement?
        System.out.println("The above code throws error");
    }
}
