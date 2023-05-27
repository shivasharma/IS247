package Exceptions.CustomException;

//Extending from the RuntimeException becomes unchecked exception  you do no need to handle it.
//public class CustomExceptionExample extends RuntimeException{
public class CustomExceptionExample extends Exception {
    public CustomExceptionExample(String message) {
        super(message);
    }


}
