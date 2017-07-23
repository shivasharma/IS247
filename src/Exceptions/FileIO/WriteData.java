package Exceptions.FileIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Shiva on 7/23/2017.
 */
public class WriteData {

    public static void main(String args[]) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        //PrintWriter constructor that will create new file
        PrintWriter output = new PrintWriter(file);

        output.print("Shiva Sharma");
        output.println(100);
        output.close();
    }
}
