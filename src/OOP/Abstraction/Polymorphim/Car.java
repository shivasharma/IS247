package OOP.Abstraction.Polymorphim;

// Base class for all vehicles
class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}

// Derived class for Tesla cars
class Tesla extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Tesla engine started silently.");
    }
}

class BMW extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("BMW engine started loudly.");
    }
}


// Main class to demonstrate polymorphism
public class Car {
    public static void main(String[] args) {
        // Polymorphism in action
        Vehicle myVehicle = new Tesla();
        myVehicle.startEngine(); // Outputs: Tesla engine started silently.


        // You can also have an array of different vehicles
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Vehicle();
        vehicles[1] = new Tesla();

        // Start engines for all vehicles
        for (Vehicle v : vehicles) {
            v.startEngine(); // The specific startEngine method is called for each vehicle
        }


        Vehicle myBMW = new BMW();
        myBMW.startEngine(); //Outputs: BMW engine started loudly.

    }
}
