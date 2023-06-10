package FileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        java.io.File file = new java.io.File("files/scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            // System.exit(1);
        }

        // Create a file
        PrintWriter output = new PrintWriter(file);

        // Write formatted output to the file
        output.print("John T. Perez ");
        output.println(90);
        output.print("Jamal K. Johnson ");
        output.println(85);

        // Close the file, data is not saved until file is closed
        output.close();
    }
}
