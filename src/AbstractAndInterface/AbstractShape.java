package AbstractAndInterface;

/**
 * Created by Shiva on 5/30/2023.
 * //Class Lab
 * //create a new Square class which extends from Shape class
 * //Add draw method and print a message
 * //Create an object of Square class and display the result
 */
abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle1 extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
}


public class AbstractShape {
    public static void main(String[] args) {

        Shape rectangel = new Rectangle();
        Shape shape = new Circle1();
        shape.draw();
        rectangel.draw();

    }

}
