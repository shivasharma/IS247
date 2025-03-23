// A generic class
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Box for Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        System.out.println("Integer Box: " + integerBox.getItem());

        // Create a Box for String
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");
        System.out.println("String Box: " + stringBox.getItem());
    }
}
