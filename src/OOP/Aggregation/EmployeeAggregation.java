package OOP.Aggregation;

/**
 * Created by Shiva on 7/28/2017.
 */

public class EmployeeAggregation {


    int id;
    String name;
    Address address;
    Shiva shiva;

    public EmployeeAggregation(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Address address1 = new Address("gzb", "MD", "USA", "test");
        Address address2 = new Address("gno", "MT", "CANADA", "");

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





