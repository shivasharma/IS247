package OOP.Abstraction.Polymorphim;

/**
 * Created by Shiva on 8/20/2017.
 */


class Human {
}

class Girl extends Human {
    public void walk() {
        System.out.println("Girl walks");
    }

}


class StaticBinding {
    public static void main(String[] args) {
        // Girl class is calling the method walk() of the same class
        // Since nothing is ambiguous here, compiler would be able to resolve this binding during compile-time,
        // such kind of binding is known as static binding.
        Girl obj1 = new Girl();
        obj1.walk();
    }
}
