package ExceptionsChapter12.FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by Shiva on 8/28/2017.
 */
public class FilePath {

    public static void main(String[] args) {


        //This is java7 new library
        Path sourceFile = Paths.get("files", "target.txt");
        Path targetFile = Paths.get("files", "traget1.txt");

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File Copied");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
