package Exceptions.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedVSUncheckedException {

    public static void main(String[] main) {
        //checked exception
        // readFile("abc.txt");
        //readFileusingThrows("shiva.txt");

        //unchecked exception null pointer exception is unchecked exception
        String name = null;
        unCheckedException(name);
        //unCheckedException(name,"test");
    }


    //File not found is checked exception
    private static void readFile(String filename) {
        //This code shows checked exception
        //(FileReader reader = new FileReader(filename)){}

        try (FileReader reader = new FileReader(filename)) {
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("The file location does not exist");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void readFileusingThrows(String filename) throws FileNotFoundException {

        FileReader reader = new FileReader(filename);
    }

    private static void unCheckedException(String mymessage) {

        System.out.println(mymessage.length());

    }
   /*
    private static void unCheckedException(String mymessage) {

       throw new Exceptioon(); checked exception
       throw new RuntimeException(); // unchecked exception
    }
    */

   /*
    private static void unCheckedException(String mymessage) {
        try{
        System.out.println(mymessage.length());
        }catch (NullPointerException npe){
            System.out.println("String cannot be null");
        }
    }
    */
}
