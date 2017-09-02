package AbstractAndInterface;

/**
 * Created by Shiva on 9/2/2017.
 */


interface A {
    void a();

    void b();

    void c();

    void d();
    // void e();
}

abstract class B implements A {
    //what happends if we remove this method
    public void c() {
        System.out.println("I am C");
    }
}

class M extends B {
    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }

    //  public void e() {

    // }
}

public class AbstractandInterface {
    public static void main(String args[]) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
