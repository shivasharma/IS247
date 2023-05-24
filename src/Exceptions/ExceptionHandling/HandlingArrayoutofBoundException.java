package Exceptions.ExceptionHandling;

public class HandlingArrayoutofBoundException {

    public static void main(String[] args) {
        System.out.println("Element of the array");
        int[] ar = {1, 2, 3};
        try {
            for (int i = 0; i <= ar.length; i++) {
                System.out.println(ar[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }

        System.out.println("It should print this line");
    }
}
