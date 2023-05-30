package AbstractAndInterface;

/**
 * Created by Shiva on 9/2/2017.
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

//create a new Square class which extends from Shapr class
//Add draw method and print a message
//Create an object of Square class and display the result

public class AbstractShape {
    public static void main(String[] args) {

        Shape rectangel = new Rectangle();
        Shape shape = new Circle1();
        shape.draw();

    }

}
