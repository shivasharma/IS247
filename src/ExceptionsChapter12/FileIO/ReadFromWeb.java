package ExceptionsChapter12.FileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Shiva on 8/28/2017.
 */
public class ReadFromWeb {
    public static void main(String[] args) throws IOException {
        URL oracle = new URL("https://docs.oracle.com/javase/7/docs/api/java/io/FileWriter.html");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
