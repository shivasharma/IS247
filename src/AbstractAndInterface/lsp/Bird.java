package AbstractAndInterface.lsp;

public class Bird {
    void fly() {
        System.out.println("This bird is flying...");
    }
}

class Penguin extends Bird {
    // ❌ Problem: Penguins cannot fly, but we are forced to implement fly()!
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}
