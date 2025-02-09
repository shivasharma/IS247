package Exceptions.ThrowingException;

import java.io.FileWriter;
import java.io.IOException;

public class ThrowsExample {
    //what will happen if we take out IOException from main code?
    public static void main(String[] args) throws IOException {
        String filename = "abc.txt";
        String text = "Hey there, what's up?";
//        FileWriter fileWriter = new FileWriter(filename);
//        fileWriter.write(text);
//        fileWriter.close();

        writeToFile(text, filename);
        // writeToFileWithTryCatch(text, filename);
    }

    public static void writeToFile(String text, String filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        fileWriter.write(text);
        fileWriter.close();
    }

    public static void writeToFileWithTryCatch(String text, String filename) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
