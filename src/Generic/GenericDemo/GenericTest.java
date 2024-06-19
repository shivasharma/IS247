package Generic.GenericDemo;

public class GenericTest {
    public static void main(String[] args) {

        Data d1 = new Data("This is a data constructor");
        System.out.println(d1);

        DataGeneric<String> d3 = new DataGeneric<>("This is Generic");
        System.out.println(d3);
        d3.setData("IS247");
        System.out.println("This d3 is " + d3.getData());
        System.out.println(d3);

        DataGeneric<Integer> d4 = new DataGeneric<>(1);
        System.out.println(d4);


    }
}
