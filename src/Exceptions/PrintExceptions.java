package Exceptions;

/**
 * Created by Shiva on 7/14/2017.
 */
public class PrintExceptions {
    public static void main(String[] args) {

        //initialize exception class;
        Exception ex = new Exception();
        System.out.println(ex);

        //initialize exception class constructor with message;
        Exception message = new Exception("This is my exception message");
        System.out.println(message);

        Exception exException = new Exception(message);
        System.out.println(exException);

        Exception exBoth = new Exception("This is another exception", message);
        //print exception message
        System.out.println(exBoth);
        //this is how we ask for exception
        System.out.println(exBoth.getCause());
    }
}
