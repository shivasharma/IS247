package FileIO;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Shiva on 7/23/2017.
 */
public class FileClass {
    public static void main(String[] args) throws IOException {

        // File();
        // WriteFile();
        //ReadFile();
        readFileScanner();
    }

    private static void File() throws IOException {
        File file = new File("C:\\temp1");
        System.out.println("Does  it exist " + file.exists());
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

    private static void ReadFile() throws IOException {
        FileInputStream file = new FileInputStream("files/fileexample.txt");
        //file.read(); //This will return ASCII charater
        //System.out.println(file.read());
        // System.out.println((char)file.read());
        int i = file.read();
        while (!(i == -1)) {
            char c = (char) i;
            System.out.print(c);
            i = file.read();
        }
        file.close();
    }

    private static void WriteFile() throws IOException {
        File file = new File("files/fileexample.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);
        String texttowrite = "This is IS247 programming";
        fos.write(texttowrite.getBytes());
        fos.flush();
        fos.close();
    }

    private static void readFileScanner() throws FileNotFoundException {
        File file = new File("files/fileexample.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }

}
