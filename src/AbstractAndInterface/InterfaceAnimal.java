package AbstractAndInterface;


interface Animal {
    void eat();

    void travel();

    void mamalName();
    //implement this method to print
    //void run();
}

public class InterfaceAnimal implements Animal {

    public static void main(String[] args) {
        /* Can i do this?
         Animal animal=new Animal();
        */

        InterfaceAnimal m = new InterfaceAnimal();
        m.eat();
        m.travel();
        m.mamalName();
    }

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public void mamalName() {
        System.out.println("Tiger");
    }


}

