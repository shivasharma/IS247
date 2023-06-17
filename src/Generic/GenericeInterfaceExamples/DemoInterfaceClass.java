package Generic.GenericeInterfaceExamples;

//Generic interface definition
interface DemoInterface<T1, T2> {
    T2 doSomeOperation(T1 t);

    T1 doReverseOperation(T2 t);
}

public class DemoInterfaceClass implements DemoInterface<String, String> {
    public static void main(String[] args) {
        DemoInterfaceClass dic = new DemoInterfaceClass();
        String generic1 = dic.doSomeOperation("20");
        String generic2 = dic.doReverseOperation("IS247");
        System.out.println(generic1);
        System.out.println(generic2);
    }

    public String doSomeOperation(String t) {
        return ("10");
    }

    public String doReverseOperation(String t) {
        return t;
    }
}