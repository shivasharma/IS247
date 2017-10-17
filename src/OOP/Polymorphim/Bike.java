package OOP.Polymorphim;

/**
 * Created by Shiva on 7/29/2017.
 */
class Bike {
    void run() {
        System.out.println("running");
    }
}

class Mountain extends Bike {
    public static void main(String args[]) {
        Bike b = new Mountain();

        //Mountain b1 = new Bike();
        //upcasting method invocation is determint be the JVM not complier as runtime polymorphism
        b.run();
    }

    void run() {
        System.out.println("running safely with 60km");
    }
}
