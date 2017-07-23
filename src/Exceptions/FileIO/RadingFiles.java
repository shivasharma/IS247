package Exceptions.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Shiva on 7/23/2017.
 */
public class RadingFiles {
    public static void main(String[] args) throws Exception {
        //Reading file using BufferReader class
        File file = new File("C:\\temp\\\\\\java.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }


        File file1 = new File("C:\\temp\\\\\\java.txt");
        Scanner sc = new Scanner(file1);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        FileReader fr = new FileReader("C:\\temp\\java.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
    }

}
