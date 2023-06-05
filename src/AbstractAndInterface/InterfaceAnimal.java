package AbstractAndInterface;

/**
 * Created by Shiva on 9/2/2017.
 */
interface Animal {
    void eat();

    void travel();

    void MamalType();
}

public class InterfaceAnimal implements Animal {

    public static void main(String[] args) {
        InterfaceAnimal m = new InterfaceAnimal();
        m.eat();
        m.travel();
        m.MamalType();
    }

    public void eat() {
        System.out.println("Mammal eats");
    }


    public void travel() {
        System.out.println("Mammal travels");
    }

    public void MamalType() {

        System.out.println("Tiger");
    }


}

