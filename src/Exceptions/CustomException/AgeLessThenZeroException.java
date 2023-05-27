package Exceptions.CustomException;

public class AgeLessThenZeroException extends Exception {

    public AgeLessThenZeroException() {
    }

    public AgeLessThenZeroException(String message) {
        super(message);
    }


    //This will print the cause of the exception for e.g Runtime.
    public AgeLessThenZeroException(Throwable cause) {
        super(cause);
    }

    public AgeLessThenZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
