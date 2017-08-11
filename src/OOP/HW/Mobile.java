package OOP.HW;

/**
 * Created by Shiva on 8/10/2017.
 */
public class Mobile {

    public String model;
    private String manufacturer;
    private String operating_system;
    private int cost;

    //Constructor to set properties/characteristics of object
    Mobile(String man, String o, String m, int c) {
        this.manufacturer = man;
        this.operating_system = o;
        this.model = m;
        this.cost = c;
    }

    public static void main(String[] args) {
        //Creating Object of SuperClass and calling getModel Method

        System.out.println(m.manufacturer);
        System.out.println(m.getModel());
        //Creating Object of Sublcass and calling getModel Method
        System.out.println(a.getModel());
        //Creating Object of Sublcass and calling getModel Method

        System.out.println(b.getModel());
    }

    //Method to get access Model property of Object
    public String getModel() {

    }
}

class Android extends Mobile {
    //Constructor to set properties/characteristics of object
    Android(String man, String o, String m, int c) {

    }

    //Method to get access Model property of Object
    public String getModel() {
        return "This is Android Mobile- " + model;
    }
}

class Blackberry extends Mobile {
    //Constructor to set properties/characteristics of object
    Blackberry(String man, String o, String m, int c) {

    }

    public String getModel() {
        return "This is Blackberry-" + model;
    }
}