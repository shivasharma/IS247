package FileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JavaoldandNio {
    public static void main(String[] args) throws IOException {

        String fileName = "files/data.csv";
        System.out.println("Using old methods");
        //  printFileSize(fileName);

        System.out.println("Using nio.file methods");
        // printFileSizeNIO(fileName);

        //CreateFileUsingNIO();

        ReadFileUsingNIO();

    }

    private static void ReadFileUsingNIO() throws IOException {
        Path p = Paths.get("files/nio.txt");
        List<String> lines = Files.readAllLines(p);
        lines.forEach(System.out::println);

        System.out.println("Printing using for loop");
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
    }

    private static void CreateFileUsingNIO() throws IOException {
        Path p = Paths.get("files/nio.txt");
        Path path1 = Files.createFile(p);
        String content = "IS 247 Programming";
        Files.write(path1, content.getBytes());
        System.out.println("Data written as byte array");
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
