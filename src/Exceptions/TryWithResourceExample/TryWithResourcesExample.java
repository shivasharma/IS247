package Exceptions.TryWithResourceExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourcesExample {

    public static void main(String[] main) throws IOException {
        try (FileInputStream input = new FileInputStream(".input.txt");
             FileOutputStream output = new FileOutputStream("./output.txt")) {
            output.write(input.readAllBytes());
        }
    }
}
