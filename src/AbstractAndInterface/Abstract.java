package AbstractAndInterface;

/**
 * Created by Shiva on 9/1/2017.
 */
//This is abstract class
abstract class BikeParentClass {
    //what happens if the abstract keyword is removed from the method
    abstract void run();

    void sleep() {
        System.out.println("Program is sleeping");
    }
}

//Honda is a concrete class
class HondaChildClass extends BikeParentClass {
    void run() {
        System.out.println("running safely..");
    }
}

public class Abstract {

    public static void main(String[] args) {
        //creating an object of Honda class
        //can we do this
        //Honda honda= new Bike();
        BikeParentClass obj = new HondaChildClass();
        obj.run();
    }
}
