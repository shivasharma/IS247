package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputUsingScanner {
    public static void main(String[] args) {
        Scanner infile;
        try {
            //rename the file name scanner1.txt
            // What will happen if we add string to the scanner.txt file
            infile = new Scanner(new File("files/scanner.txt"));
            int input;
            while (infile.hasNext()) {
                input = infile.nextInt();
                System.out.println(input);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
    }
}