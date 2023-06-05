package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchSyntax {
    public static void main(String[] args) {
        TrycatchSyntax();
    }

    public static void TrycatchSyntax() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("files/text.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.err.format("FileNotFoundException %s%n", ex);
        } catch (IOException ex) {
            System.err.format("IOException %s%n", ex);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
