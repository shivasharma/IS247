package AbstractAndInterface;

/**
 * Created by Shiva on 5/29/2023.
 */
//This is abstract class
abstract class Vehicle {
    //what happens if the abstract keyword is removed from the method
    abstract void run();

    void sleep() {
        System.out.println("Sleep method from the abstract class Vehicle");
    }

    abstract String EngineType();
}

//Honda is a concrete class
class Honda extends Vehicle {
    void run() {
        System.out.println("Run method from the Honda extends Vehicle");
    }

    @Override
    String EngineType() {
        String engineType = "Gasoline";
        return engineType;
    }

    void stop() {
        System.out.println("Stop method from Honda extends Vehicle");
    }
}

class Tesla extends Vehicle {

    @Override
    void run() {

    }

    @Override
    String EngineType() {
        String engineType = "Electric";
        return engineType;
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        //creating an object of Honda class
        //can we create object of Vehicle
        //use honda object and call stop method

        Honda honda = new Honda();
        honda.stop();


    }


}
