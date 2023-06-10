package FileIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderReadingFIle {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("files/filereader.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println("File does not exist");

        }
    }
}
