package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputUsingScanner {
    public static void main(String[] args) {
        Scanner infile;
        try {
            //rename the file name scanner1.txt
            infile = new Scanner(new File("files/scannner.txt"));
            int input;
             //String input;
            while (infile.hasNext()) {
                //What will happen if the scanner.txt has string values?
                input = infile.nextInt();
                // input=infile.next();
                System.out.println(input);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
    }
}
