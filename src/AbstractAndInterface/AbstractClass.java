package AbstractAndInterface;

/**
 * Created by Shiva on 5/29/2023.
 */
//This is abstract class
abstract class BikeParentClass {
    //what happens if the abstract keyword is removed from the method
    abstract void run();
    void sleep() {
        System.out.println("Sleep method from the abstract class BikeParentClass");
    }
}

//Honda is a concrete class
class HondaChildClass extends BikeParentClass {
    void run() {
        System.out.println("Run method from the HondaChildClass extends BikeParentClass");
    }

    void stop() {
        System.out.println("Stop method from HondaChildClass extends BikeParentClass");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        //creating an object of Honda class
        //can we create object of BikeParentClass
        //use honda object and call stop method
        /*
        HondaChildClass honda= new BikeParentClass();
        BikeParentClass obj = new HondaChildClass();
        obj.run();
        obj.sleep();
        */
    }


}
