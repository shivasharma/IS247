package AbstractAndInterface;

interface InterfaceClass {
    int i = 20; //public static final

    void display(); //all the method are abstract and public
}

interface InterfaceClass2 {
    int i = 30; //public static final

    void show(); //all the method are abstract and public
}

abstract class AbstractClassTest {
    static final int f = 100;
    protected int i = 0;

    abstract void show();

    void display() {
        System.out.println("This is display method from Abstract class");
    }
}

class AbstractClassExample extends AbstractClassTest {
    void show() {
        System.out.println("This is a show method from abstract class");
    }
}

class InterfaceExample implements InterfaceClass, InterfaceClass2 {

    public void display() {
        System.out.println("The is a display method from InterfaceClass ");
    }

    @Override
    public void show() {
        System.out.println("This is a show method from InterfaceClass2.");
    }
}

public class AbstractandInterfaceExample {
    public static void main(String... args) {
        System.out.println("Example of Abstract Class");
        System.out.println("*************************************");
        AbstractClassExample a = new AbstractClassExample();
        a.display();
        a.show();
        a.i = 30;
        System.out.println(a.i);
        System.out.println(AbstractClassExample.f);

        System.out.println("Example of Interface Class");
        System.out.println("*************************************");
        InterfaceExample ref = new InterfaceExample();

        ref.display();
        ref.show();
        System.out.println(InterfaceClass.i);

    }
}
