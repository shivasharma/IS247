package Exceptions.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HandlingFileCheckedException {
    public static void main(String... args) {
        try {
            FileInputStream fis = new FileInputStream("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
