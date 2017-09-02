package AbstractAndInterface;

/**
 * Created by Shiva on 9/1/2017.
 */
//This is abstract class
abstract class Bike {
    //what happens if the abstract keyword is removed from the method
    abstract void run();
}

//Honda is a concrete class
class Honda extends Bike {
    void run() {
        System.out.println("running safely..");
    }
}

public class Abstract {

    public static void main(String[] args) {
        //creating an object of Honda class
        //can we do this
        //Honda honda= new Bike();
        Bike obj = new Honda();


        obj.run();
    }
}



