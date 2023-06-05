package AbstractAndInterface;

interface InterfaceClass {
    int i = 20; //public static final

    void display(); //all the method are abstract and public
}

abstract class AbstractClassTest {
    static final int f = 100;
    protected int i = 0;

    abstract void show();

    void display() {
        System.out.println("This is non-abstract method");
    }
}

class AbstractClassExample extends AbstractClassTest {


    void show() {
        System.out.println("This is a show method from abstract class");
    }
}

class InterfaceExample implements InterfaceClass {

    public void display() {
        System.out.println("The is a display method from interface I");
    }

}

public class AbstractandInterfaceExample {
    public static void main(String... args) {
        System.out.println("Example of Abstract Class");
        AbstractClassExample a = new AbstractClassExample();
        a.display();
        a.show();
        a.i = 30;
        System.out.println(a.i);
        System.out.println(AbstractClassExample.f);

        System.out.println("Example of Interface Class");
        InterfaceClass ref = new InterfaceExample();
        ref.display();
        System.out.println(InterfaceClass.i);
    }
}
