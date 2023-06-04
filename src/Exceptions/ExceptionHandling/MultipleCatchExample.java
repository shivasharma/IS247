package Exceptions.ExceptionHandling;

public class MultipleCatchExample {
    public static void main(String... args) {
        MultipleCatchExamples();
    }

    public static void MultipleCatchExamples() {
        try {

            int[] a = new int[5];
            // int a[]=null;
            // a[6]=7;
            int i = 8;
            int j = 0;
            int k = i / j;
            System.out.println("The output is" + k);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
            System.out.println("More detail" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array out of bound" + e);
            System.err.println("Array Error" + e.getCause());
            //Handle null pointer exception here
            //What will happen if we move this Exception in the beginning?
        } catch (Exception e) {
            System.err.println("This will handel all type of exception" + e);

        }
    }
}
