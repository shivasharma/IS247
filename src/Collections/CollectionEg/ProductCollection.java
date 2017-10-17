package Collections.CollectionEg;


import java.util.ArrayList;
import java.util.Collection;

public class ProductCollection {

    public static void main(String[] args) {


        Product door = new Product("Front door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);
        Product roof = new Product("House Roof", 1000);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        products.add(roof);

        System.out.println(" Step 1 Printing Product Using Loop");
        System.out.println("----------------------------------------");
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println("----------------------------------------");
        System.out.println(" Step 2 Printing After Removing the Window ");
        System.out.println("----------------------------------------");
        products.remove(window);

        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("----------------------------------------");
        System.out.println(" Checking whether Window exist in product list or not ");
        System.out.println("----------------------------------------");


        System.out.println(" Window product = " + products.contains(window));
        System.out.println("----------------------------------------");
        System.out.println("Displaying the name of a wooden door = " + door.getName());
        System.out.println("----------------------------------------");
        System.out.println("Displaying the weight of a wooden door= " + door.getWeight());

    }
}
