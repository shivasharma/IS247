package AbstractAndInterface;

/**
 * Created by Shiva on 9/1/2017.
 */
abstract class Bike {
    //what happens if the abstract keyword is removed from the method
    abstract void run();
}

class Honda extends Bike {
    void run() {
        System.out.println("running safely..");
    }
}

public class Abstract {

    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
    }
}



