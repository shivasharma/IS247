// Step 1: Create an interface for birds
interface Bird {
    void eat();
}

// Step 2: Create a separate interface for flying birds
interface FlyingBird extends Bird {
    void fly();
}

// Step 3: Implement different types of birds
class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating...");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}

class Penguin implements Bird {
    @Override
    public void eat() {
        System.out.println("Penguin is eating...");
    }
}
