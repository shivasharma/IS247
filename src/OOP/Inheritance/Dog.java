package OOP.Inheritance;

/**
 * Created by Shiva on 7/29/2017.
 */


class Animal {
    void eat() {

        System.out.println("animal is eating...");
    }

    void sleep() {

        System.out.println("animal is sleeping...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("dog is eating...");
    }
}

class BabyDog1 extends Dog {
    public static void main(String args[]) {
        Animal a = new BabyDog1();
        a.eat();


        Animal b = new Animal();
        b.eat();

        Dog d = new Dog();
        d.eat();


    }
}
