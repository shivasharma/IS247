package AbstractAndInterface.lsp;

// Step 1: Create an interface for birds
interface BirdInterface {
    void eat();
}
// Step 2: Create a separate interface for flying birds
interface FlyingBird extends BirdInterface {
    void fly();
}

// Step 3: Implement different types of birds
class SparrowBird implements AbstractAndInterface.lsp.FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating...");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}

class PenguinBird implements BirdInterface {
    @Override
    public void eat() {
        System.out.println("Penguin is eating...");
    }
}

class OstrichBird implements BirdInterface {
    @Override
    public void eat() {
        System.out.println("Ostrich is eating...");
    }
}

// Step 5: Test the solution
public class BirdsolutionFile {
    public static void main(String[] args) {
        // Creating different bird objects
        SparrowBird sparrow = new SparrowBird();
        PenguinBird penguin = new PenguinBird();
        OstrichBird ostrich = new OstrichBird();

        // Testing methods
        sparrow.eat();
        sparrow.fly();
        penguin.eat();
        ostrich.eat();
    }
}

