package AbstractAndInterface.Abstract;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setEngine("Electric");


        Truck truck1 = new Truck();
        truck1.setEngine("Hybrid");

        Vehicle vehicle1 = new Car();
        vehicle1.drive();

        Vehicle vehicle2 = new Truck();
        vehicle2.drive();

        String trunckEngine = truck1.drive("Truck engine is hybrid");
        System.out.println(trunckEngine);
        String carEngine = car1.drive("Car engine is electric");
        System.out.println(carEngine);

    }


}



