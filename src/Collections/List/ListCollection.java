package Collections.List;

import java.util.*;

public class ListCollection {
    public static void main(String[] args) {
        //ArrayListExample1();
        //ArrayListExample2();
        //ArrayListExample3();
        ArraytoList();

    }

    private static void ArraytoList() {
        String[] shapes = new String[]{"square", "rectangel", "triangle"};
        List shapeList = Arrays.asList(shapes); //what kind of list is this?
        System.out.println(shapeList);
        System.out.println(shapeList.getClass().getName()); //Array is the outer classArrrayList is the inner class
        System.out.println(ColorList().getClass().getName());

        List shapeList2 = List.of(shapes); //Create using List interface and this is immutable
        //shapeList2.add("circel"); What will happen with this code

        List<String> shareList3 = new ArrayList<>();
        Collections.addAll(shareList3, shapes);
        System.out.println(shareList3); //this is mutable arraylist

    }

    private static void ArrayListExample3() {
        ArrayList<String> colorList = new ArrayList<String>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add(1, "orange");
        System.out.println("using for loop to access Arraylist methods");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println(colorList.get(i));
        }
        System.out.println("*********New For Loop************");
        //the list interface extends the collection interface, the collection interface extends the iterable interface
        for (String color : colorList) {
            System.out.println(color);
        }

        colorList.remove("orange");
        colorList.remove(2);

        System.out.println("**********Using Collection Interface forEach method******");
        colorList.forEach(color -> {
            System.out.println(color);
        });


    }

    private static void ArrayListExample1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(10);
        ArrayList arrayList3 = new ArrayList(arrayList2);

        ArrayList<String> colorList = new ArrayList<String>();
        List arrayList4 = new ArrayList();

        Collection arrayList5 = new ArrayList(); //ArrayList is a class
        // ArrayList arrayList5=new Collection() //Collection is an interface and it is more specific

    }

    private static void ArrayListExample2() {
        List<String> myList = ColorList();
        System.out.println("Initial list:" + myList);
        System.out.println("-----------------------------------");
    }

    private static List<String> ColorList() {
        List<String> myList = new ArrayList<>(1);
        myList.add("IS147");
        myList.add("IS247");
        myList.add("413");
        return myList;
    }
}
