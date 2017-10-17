package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Shiva on 7/23/2017.
 */
public class InputMisMatchException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continueInput = true;
        do {
            try {
                System.out.println("Enter an Integer");
                int number = input.nextInt();

                System.out.println("The number entered is " + number);

                continueInput = false;

            } catch (InputMismatchException ex) {
                System.out.println("Try again  incorrect input an integer is required");
                input.nextLine();

            }

        } while (continueInput);

    }

}


