package AbstractAndInterface.Abstract;

public abstract class Vehicle {

    private String engine;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("This is a drive method from Vehicle class");
    }

    public abstract String drive(String engineType);
}






