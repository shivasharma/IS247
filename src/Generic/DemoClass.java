package Generic;

public class DemoClass<T> {

    private T t;

    public static void main(String[] args) {

        DemoClass<String> instance = new DemoClass<String>();
        instance.set("IS247");   //Correct usage
        String name = instance.get();
        System.out.println(name);
        //instance.set(1); //compile time error check


        DemoClass<Integer> integerInstance = new DemoClass<>();
        integerInstance.set(10);
        Integer myName = integerInstance.get();
        System.out.println(myName);

    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
