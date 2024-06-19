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
        Store store0 = new Store();
        store0.setItem(10);
        Integer item = (Integer) store0.getItem();
        // Integer item=store0.getItem(); what is wrong with this code?
        System.out.println("using raw type:" + item);


        Store<Integer> store1 = new Store<>();
        store1.setItem(34);
        System.out.println("using generic type:" + store1.getItem());



    }
}
