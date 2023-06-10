package FileIO;

import java.io.FileWriter;
import java.io.IOException;

/**

 */
public class Filewriter {

    public static void main(String[] args) {
        try {
            //append – boolean if true, then data will be written to the end of the file rather than the beginning.
            //if append is not defined it will overwrite the file
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
