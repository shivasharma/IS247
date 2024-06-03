package Exceptions.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class CheckedVSUncheckedException {

    public static void main(String[] args) {
        checkedException();
        unCheckedException();
        }

    private static void checkedException() {
        try {
            FileReader fr = new FileReader("files/filereader1.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println("File does not exist");

        }
    }

    // UNCHECKED EXAMPLE

    private static void unCheckedException() {
        int[] numbers = {1, 2, 3, 4, 5};
        int index = 10; // Trying to access an invalid index
        try {
            int value = numbers[index]; // This line will throw an ArrayIndexOutOfBoundsException
            System.out.println("Value at index " + index + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + index);
        }
    }




}
