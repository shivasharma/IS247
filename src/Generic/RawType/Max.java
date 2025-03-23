package Generic.RawType;


class Store<T> {
    private T item;

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }

}
public class Max {

    public static void main(String[] args) {
        Store store0 = new Store(); // creates a raw type. The compiler treats T as Object.
        store0.setItem(10); //works because String is a subclass of Object
         // This compiles but can cause ClassCastException at runtime
        Integer item = (Integer) store0.getItem(); //unsafe cast
        // Integer item=store0.getItem(); what is wrong with this code?
        System.out.println("using raw type:" + item);


        Store<Integer> store1 = new Store<>();
        store1.setItem(34);
        System.out.println("using generic type:" + store1.getItem());



    }
}
