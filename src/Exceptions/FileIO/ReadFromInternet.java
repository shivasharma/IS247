package Exceptions.FileIO;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Shiva on 8/28/2017.
 */
public class ReadFromInternet {

    public static final String FlOWERS_FEED = "http://services.hanselandpetal.com/feeds/flowers.xml";

    public static void main(String[] args) throws IOException {
        InputStream stream = null;
        BufferedInputStream buf = null;
        try {
            URL url = new URL(FlOWERS_FEED);
            stream = url.openStream();
            buf = new BufferedInputStream(stream);

            StringBuilder sb = new StringBuilder();
            while (true) {
                int data = buf.read();
                if (data == -1) {
                    break;

                } else {
                    sb.append((char) data);
                }
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            stream.close();
            buf.close();
        }

    }
}
