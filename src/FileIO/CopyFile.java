package FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class CopyFile {

    public static void main(String[] args) {

        String sourceFile = "files/test.txt";
        String tragetFile = "files/target.txt";

        Path source = Paths.get(sourceFile);
        Path destination = Paths.get(tragetFile);

        // Copy the file, replacing any existing destination file
        try {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File copied successfully!");
    }
}
