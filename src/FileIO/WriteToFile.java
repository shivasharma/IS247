import java.io.FileWriter; // Tool to write to files
import java.io.IOException; // Tool to handle errors

public class WriteToFile {
    public static void main(String[] args) {
        try {
            // Step 1: Create a FileWriter (like opening a notebook)
            FileWriter writer = new FileWriter("myFile.txt");

            // Step 2: Write something into the file
            writer.write("Hello, Java! I love coding!");

            // Step 3: Close the file (like closing the notebook)
            writer.close();

            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("Oops! Something went wrong.");
        }
    }
}
