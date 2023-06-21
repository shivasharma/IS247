package Generic.GenericDemo;
//<T> means type could be of any type not bounded to a particular type. User defined type
public class BankInfo<T> {
    T t1;

    BankInfo(T t1) {
        this.t1 = t1;
    }

    public static void main(String[] args) {
        BankInfo<String> b1 = new BankInfo<>("Bank of America");
        BankInfo<Integer> b2 = new BankInfo<>(20);
        Integer[] m1 = {100, 200, 500};
        Double[] m2 = {50.5, 78.9, 78.0};
        b1.deposite(m1);
        b2.deposite(m2);

    }

    public <T> void deposite(T[] money) {
        for (T i : money) {
            System.out.print(i);
        }
    }

    public void display() {
        System.out.print(t1);
    }
}
