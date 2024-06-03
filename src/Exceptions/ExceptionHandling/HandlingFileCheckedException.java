package Exceptions.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class HandlingFileCheckedException {
    public static void main(String... args) {

        //MultipleCatchExamples();
        FileReader();
    }

    public static void FileReader() {
        try {
            FileReader fileReader = new FileReader("files/test.txt");
            int i;
            while ((i = fileReader.read()) != -1)
                System.out.print((char) i);
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public static void MultipleCatchExamples() {
        try {

            int[] a = new int[5];
            // int a[]=null;
            // a[6]=7;
            int i = 8;
            int j = 0;
            int k = i / j;
            System.out.println("The output is" + k);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
            System.out.println("More detail" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array out of bound" + e);
            System.err.println("Array Error" + e.getCause());
        } catch (Exception e) {
            System.err.println("This will handel all type of exception" + e);

        }
    }
}
