package Exceptions;

import java.io.FileReader;
import java.io.IOException;
public class CheckedException {
    public static void main(String[] args) {
        checkedExpection();

    }
    private static void checkedExpection() {
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
}


