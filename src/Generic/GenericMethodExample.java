package Generic;

/**
 * Created by Shiva on 9/2/2017.
 */
public class GenericMethodExample {

    public static void main(String[] args) {

        Integer[] ints = {10, 20, 30, 40, 50};
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        print(ints);
        print(daysOfWeek);
        nonGenericPrint(ints);
        //nonGenericPrint(daysOfWeek);
        System.out.println(add("This is string"));
        System.out.println(add(1));
    }

    //Generic Method that will print the result based on datatype provided by the users
    //By defining the type <E > before the return type
    public static <E> String add(E data) {
        return "Data is : " + data;
    }

    public static <E> void print(E[] list) {
        for (E element : list) {
            System.out.println(element + " ");
        }
        System.out.println(" ");
    }

    //This is nonGeneric Print method that take integer array
    public static void nonGenericPrint(Integer[] list) {
        for (int element : list) {
            System.out.println(element + " ");
        }
        System.out.println(" ");
    }
}
