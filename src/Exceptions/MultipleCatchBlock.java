package Exceptions;

/**
 * Created by Shiva on 7/23/2017.
 */
public class MultipleCatchBlock {

    public static void main(String args[]) {
        try {
            int a[] = new int[27];
            a[4] = 30 / 1;
            a[4] = 30 / 0;
            System.out.println("First print statement in try block");
        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Warning: Some Other exception");
        }
        System.out.println("Out of try-catch block...");
    }
}
