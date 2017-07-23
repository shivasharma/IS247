package Exceptions.FileIO;

import java.io.File;
import java.util.Date;

/**
 * Created by Shiva on 7/23/2017.
 */
public class FileClass {
    public static void main(String[] args) {

        File file = new File("C:\\temp\\java.txt");

        System.out.println("Does  it exist " + file.exists());
        System.out.println("The file has " + file.length() + "bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written " + file.canWrite());
        System.out.println("Is it a directory " + file.isDirectory());
        System.out.println("Is is absolute " + file.isAbsolute());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new Date(file.lastModified()));

        File realtiveFile = new File("relativepath.txt");

        System.out.println("Relative Path " + realtiveFile.getPath());
        System.out.println("Relative file " + realtiveFile.isAbsolute());

    }
}
