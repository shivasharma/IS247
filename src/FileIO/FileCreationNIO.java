package FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreationNIO {
    public static void main(String[] args) {
        //createFileNIO();
        // listAllFiles();
        //listAllFilesFilterNotADirectory();
        createDirectory();
    }

    public static void createDirectory() {
        try {
            Files.list(Paths.get("."))
                    .filter(file -> !Files.isDirectory(file))
                    .forEach(System.out::println);
            if (Files.notExists(Paths.get("src/FileIO/resources/example"))) {
                Files.createDirectory(Paths.get("src/FileIO/resources/example"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listAllFiles() {
        try {
            Files.list(Paths.get("."))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listAllFilesFilterNotADirectory() {
        try {
            Files.list(Paths.get("."))
                    .filter(file -> !Files.isDirectory(file))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFileNIO() {
        try {
            Path path = Paths.get("src/FileIO/resources/example.txt");
            if (Files.notExists(path)) {
                Files.createFile(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
