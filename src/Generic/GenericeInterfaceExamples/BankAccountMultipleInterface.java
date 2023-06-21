package Generic.GenericeInterfaceExamples;

//Cannot add multiple call but can add multiple interface
//public class BankAccountMultipleInterface<T extends  Number & Runnable & Serializable>
public class BankAccountMultipleInterface<T extends Number> {

    public static void main(String[] args) {
        //This is bounded to the Number Type
        //BankAccountMultipleInterface<String> b1=new BankAccountMultipleInterface<>();
        BankAccountMultipleInterface<Number> b1 = new BankAccountMultipleInterface<>();
        Integer[] m1 = {100, 200, 300};
        Double[] m2 = {15.6, 56.7, 78.8};
        String[] s1 = {"IS147", "IS247"};
        b1.display(m1);
        b1.display(m2);
        //what will happen here?
        // b1.display(s1);
    }

    public void display(T[] t1) {
        for (T i : t1) {
            System.out.print(i);
        }
    }
}
