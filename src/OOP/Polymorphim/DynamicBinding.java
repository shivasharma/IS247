package OOP.Polymorphim;

/**
 * Created by Shiva on 8/20/2017.
 */
class HumanBeing {
    public void walk() {
        System.out.println("Human walks");
    }
}

class Boy extends HumanBeing {

    public static void DynaicBinding(String args[]) {
        /*
        Here Human is a super class and Boy is a child class since Boy extends Human. Both
        these classes have a same method void walk(). Since we
        have assigned the parent class reference to the child
        class object, during call of walk() method
        the compiler would not be able to
        decide which walk() method to call. It will be confused between the walk() method of Human class and walk() method of Boy class.
        Such kind of bindings are known as dynamic binding as compiler figures out the object type in runtime.
        */
        HumanBeing myobj = new Boy();
        myobj.walk();
    }

    public void walk() {
        System.out.println("Boy walks");
    }
}
