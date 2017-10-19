package OOP.Aggregation;

/**
 * Created by Shiva on 7/28/2017.
 */

public class EmployeeAggregation {


    int id;
    String name;
    Address address;

    public EmployeeAggregation(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        //creating an object of address class
        Address address1 =
                new Address("Crofton", "MD", "USA");
        Address address2 = new Address("Baltimore", "MD", "USA");

        EmployeeAggregation e = new EmployeeAggregation(111, "John", address1);
        EmployeeAggregation e2 = new EmployeeAggregation(112, "Smith", address2);

        e.display();
        e2.display();

    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }


}





