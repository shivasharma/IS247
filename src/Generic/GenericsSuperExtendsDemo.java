package Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsSuperExtendsDemo {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        System.out.println("Hello World!");

        List<Number> numbers = new ArrayList<>();
        fillNumbers(numbers);
        printNumbers(numbers);

        {
            List<Number> floats = new ArrayList<>();
            floats.add(Float.valueOf(1.2f));
            printNumbers(floats);
        }
        {
            List<Float> floats = new ArrayList<>();
            floats.add(Float.valueOf(1.2f));
            printNumbers(floats);
        }
        {
            List<Integer> integers = new ArrayList<>();
            printNumbers(integers);
        }
        {
            List<Object> objects = new ArrayList<>();
            fillNumbers(objects);
        }
    }

    public static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.print(number);
            System.out.print(", ");
        }
    }

    public static void fillNumbers(List<? super Number> list) {
        Number n = Integer.MAX_VALUE;
        list.add(n);
        list.add(3);
    }
}
