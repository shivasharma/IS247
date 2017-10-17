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

public class AbstractShape {
    public static void main(String args[]) {

        Shape rectangel = new Rectangle();
        Shape shape = new Circle1();
        shape.draw();

    }

}
