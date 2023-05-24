package OOP.Abstraction;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();    // Calls the draw() method of the Circle class
        rectangle.draw(); // Calls the draw() method of the Rectangle class
    }
}
/*
When we call the draw() method on these objects,
the actual method called depends on the type of the object at runtime.
 Each subclass provides its own implementation of the draw() method.
 This is an example of abstraction, where the abstract class Shape defines the
 common interface (the draw() method) that all its subclasses must implement.

Note that the draw() method in the Circle and Rectangle classes overrides
 the abstract method defined in
the Shape class using the @Override annotation
 */