import java.io.FileReader; // Tool to read from files
import java.io.IOException; // Tool to handle errors

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            // Step 1: Create a FileReader (like opening a notebook)
            FileReader reader = new FileReader("myFile.txt");

            // Step 2: Read each character from the file
            int data;
            while ((data = reader.read()) != -1) { // Read until the end of the file
                System.out.print((char) data); // Print each character to the screen
            }

            // Step 3: Close the file (like closing the notebook)
            reader.close();
        } catch (IOException e) {
            System.out.println("Oops! File not found.");
        }
    }
}
