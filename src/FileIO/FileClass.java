package FileIO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Shiva on 7/23/2017.
 */
public class FileClass {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\temp");

        System.out.println("Does  it exist " + file.exists());
        System.out.println("The file has " + file.length() + "bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written " + file.canWrite());
        System.out.println("Is it a directory " + file.isDirectory());
        System.out.println("Is is absolute " + file.isAbsolute());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new Date(file.lastModified()));
        System.out.println("Full path file " + file.getCanonicalPath());
        File relativeFile = new File("src/FileIO/relativepath.txt");
        System.out.println("Relative Path " + relativeFile.getPath());
        //A canonical pathname is both absolute and unique
        System.out.println("Full path file " + relativeFile.getCanonicalPath());


    }
}
