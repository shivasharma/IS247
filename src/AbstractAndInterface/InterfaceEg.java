package AbstractAndInterface;

/**
 * Created by Shiva on 9/1/2017.
 */
//This is Interface class

interface MotorBike {
    void run();
}

public class InterfaceEg implements MotorBike {

    public static void main(String args[]) {
        InterfaceEg m = new InterfaceEg();
        m.run();
    }

    public void run() {
        System.out.println("running safely.. ");
    }
}

