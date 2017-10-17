package Exceptions.FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by Shiva on 8/28/2017.
 */
public class CopyFile {

    public static void main(String[] args) {

        String sourceFile = "files/test.txt";
        String tragetFile = "files/target.txt";

        try {
            FileReader fReader = new FileReader(sourceFile);
            BufferedReader bReader = new BufferedReader((fReader));
            FileWriter writer = new FileWriter(tragetFile);
            while (true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                } else {
                    writer.write(line + "\n");
                }
            }
            System.out.println("File Copied");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
