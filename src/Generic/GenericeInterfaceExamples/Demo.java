package Generic.GenericeInterfaceExamples;

public class Demo {
    public static void main(String[] args) {
        Data<String> d1 = new Data<>("This is d1");
        System.out.println(d1);

        Data<Integer> d2 = new Data<>(10);
        System.out.println(d2);

        //Implementing IData interface
        IData<String> d3 = new Data<>("This is generice interface");
        System.out.println(d3);
        //java built in generic tyoe
        // Comparable interface
        ComparableExample();
    }

    private static void ComparableExample() {
        String value1 = "apple";
        String value2 = "apple";
        int result = value2.compareTo(value1);
        boolean result2 = value2.equals(value1);
        System.out.println(result);
        System.out.println(result2);
    }
}
