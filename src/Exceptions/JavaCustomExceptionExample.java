package Exceptions;

/**
 * Created by Shiva on 7/23/2017.
 */
public class JavaCustomExceptionExample {

    public static void main(String[] args) {        // create a new foo
        Foo foo = new Foo();
        // intentionally throw our custom exception by
        // calling getBar with a zero
        try {
            String bar = foo.getBar(10);
        } catch (AlsCustomException e) {
            e.printStackTrace();
        }
    }
}

/**
 * Our test class to demonstrate our custom exception.
 */
class Foo {
    public String getBar(int i) throws AlsCustomException {
        if (i == 0) {
            throw new AlsCustomException("Anything but zero ...");
        } else {
            return "Thanks";
        }

    }
}

/**
 * My custom exception class.
 */
class AlsCustomException extends Exception {
    public AlsCustomException(String message) {
        super(message);
    }
}
