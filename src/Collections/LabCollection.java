package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class LabCollection {

    public static void main(String[] args) {


        ArrayList<String> groceries1 = new ArrayList(Arrays.asList("milk", "bread", "cheese"));

        ArrayList<String> groceries2 = new ArrayList<>();
        groceries2.add("Butter");
        groceries2.add("eggs");
        groceries2.add("sugar");

        groceries1.add("bacon");

        groceries1.addAll(groceries2);
        System.out.println(groceries1);

        if (groceries1.contains("milk")) {
            groceries1.remove("milk");
        }


        System.out.println(groceries1);

    }
}
