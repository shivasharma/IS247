package FileIO;

import java.io.*;

//fullpath =>c:\\users\\shiva\\example\\output.txt"
//relativepath => output.txt
public class BufferedWriter {


    public static void main(String... args) {

        try {
            java.io.BufferedWriter writer = new java.io.BufferedWriter(new FileWriter("files/output.txt"));

            writeFile(writer);
            productList(writer);
            writer.close();

            java.io.BufferedReader reader = new java.io.BufferedReader(new FileReader("files/output.txt"));
            readFile(reader);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(Writer writer) {
        try {
            writer.write("This is a first text");
            writer.write("This  is a second text");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(BufferedReader reader) {
        try {
            String line;
            while ((line = reader.readLine()) != null) { //loop through line and read
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] productList(Writer writer) throws IOException {
        String[] products = {"Computer", "Phone", "Monitor", "Printers"};
        for (String product : products) {
            writer.write("\n" + product);
        }
        return products;
    }


}
