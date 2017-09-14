package ExceptionsChapter12.FileIO;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Shiva on 7/23/2017.
 */
public class ReadingFiles {
    public static void main(String[] args) throws Exception {
        //Reading file using BufferReader class
        File file = new File("C:\\temp\\java.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
        String sourceFile = "files/test.txt";

        File file1 = new File(sourceFile);
        Scanner sc = new Scanner(file1);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        try {
            FileReader fr = new FileReader("C:\\temp\\java1.txt");

            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
