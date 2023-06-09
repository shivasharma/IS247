package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) throws IOException {
        String filePath = "files/fileoutputstream.txt";
        FileOutputStreamWithAppend(filePath);
        FileOutputStreamTryWithResource(filePath);
        ReadFileOutSteam(filePath);
    }

    private static void FileOutputStreamWithAppend(String filePath) {
        try {
            java.io.FileOutputStream fos = new FileOutputStream(filePath, true); //adding true will append the text
            String writeText = "\nIS247 Programming II";
            //FileOutputStream overload methods
            fos.write(65);
            fos.write(writeText.getBytes());
            fos.write(writeText.getBytes(), 5, 5);
            fos.write(writeText.getBytes(), 5, writeText.length() - 5);
            fos.close(); //close the stream or we can use closable interface from FileOutStream class

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void FileOutputStreamTryWithResource(String filePath) throws IOException {
        try (java.io.FileOutputStream fos = new FileOutputStream(filePath)) { //adding true will append the text
            String writeText = "\nIS247 Programming II";
            //FileOutputStream overload methods
            fos.write(65);
            fos.write(writeText.getBytes());
            fos.write(writeText.getBytes(), 5, 5);
            fos.write(writeText.getBytes(), 5, writeText.length() - 5);
        }//complier will automatically close the stream once it r
    }

    private static void ReadFileOutSteam(String filePath) throws IOException {

        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte[] bytes = fis.readAllBytes();
            String readText = new String(bytes);
            System.out.println(readText);
        }

    }
}

