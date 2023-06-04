package Exceptions.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandlingFileCheckedException {
    public static void main(String... args) {
        WriteExceptionToLog wel = new WriteExceptionToLog();
        FileInput();
        // FileReader();
    }

    public static void FileInput() {
        try {
            FileInputStream fis = new FileInputStream("Test.txt");
        } catch (FileNotFoundException e) {
            WriteExceptionToLog.writeExceptionToLog(e, e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void FileReader() {
        try {
            FileReader fileReader = new FileReader("Test.txt");
            System.out.println(fileReader.read());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
