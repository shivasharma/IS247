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

/*
 When we call the sound() method on these objects, polymorphism comes into play.
  The actual method called depends on the type of the object at runtime.
  The sound() method of the respective subclass is invoked, even though we're
   using the Animal reference to call the method. This is an example of dynamic
   polymorphism or runtime polymorphism.

 */