class Bird {
    void fly() {
        System.out.println("This bird is flying...");
    }
}

class Sparrow extends Bird {
    // Sparrow can fly, so this works fine
}

class Penguin extends Bird {
    // ❌ Problem: Penguins cannot fly, but we are forced to implement fly()!
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}
