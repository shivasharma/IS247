package Generic.GenericDemo;

public class BankInfo<T> {
    T t1;

    BankInfo(T t1) {
        this.t1 = t1;
    }

    public static void main(String[] args) {
        BankInfo<String> b1 = new BankInfo<>("Bank of America");
        BankInfo<Integer> b2 = new BankInfo<>(20);

    }

    public void display() {
        System.out.println(t1);
    }
}
