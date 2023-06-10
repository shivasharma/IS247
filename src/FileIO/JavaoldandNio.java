package FileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaoldandNio {
    public static void main(String[] args) {
        String fileName = "files/data.csv";
        System.out.println("Using old methods");
        printFileSize(fileName);
        System.out.println("Using nio.file methods");
        printFileSizeNIO(fileName);
    }

    public static void printFileSizeNIO(String fileName) {

        Path path = Paths.get(fileName);

        try {

            // size of a file (in bytes)
            long bytes = Files.size(path);
            System.out.printf("%,d bytes%n", bytes);
            System.out.printf("%,d kilobytes%n", bytes / 1024);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void printFileSize(String fileName) {

        File file = new File(fileName);

        if (file.exists()) {

            // size of a file (in bytes)
            long bytes = file.length();

            long kilobytes = (bytes / 1024);
            long megabytes = (kilobytes / 1024);
            long gigabytes = (megabytes / 1024);


            System.out.printf("%,d bytes%n", bytes);
            System.out.printf("%,d kilobytes%n", kilobytes);


        } else {
            System.out.println("File does not exist!");
        }

    }

}
