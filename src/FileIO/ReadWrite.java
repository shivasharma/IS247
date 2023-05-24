package FileIO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Shiva on 8/28/2017.
 */
public class ReadWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("files/MyFile.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
