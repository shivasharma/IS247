package Exceptions.CustomException;

public class TestCustomExceptionClass {
    public static void main(String[] main) throws CustomExceptionExample, AgeLessThenZeroException {
        ValidateAge(-1);

    }

    private static void ValidateAge(int age) throws AgeLessThenZeroException, CustomExceptionExample {
        if (age < 0) {
            // throw  new CustomExceptionExample("Age cannot be zero");
            // throw new AgeLessThenZeorException("Invalid age");
            throw new AgeLessThenZeroException("Error", new RuntimeException());
        }
    }
}
