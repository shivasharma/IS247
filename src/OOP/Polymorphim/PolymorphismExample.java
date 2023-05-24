package OOP.Polymorphim;

class Animal {
    public void sound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound(); // Calls the sound() method of the Dog class
        animal2.sound(); // Calls the sound() method of the Cat class
    }
}
