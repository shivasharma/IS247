package OOP.Inheritance;

/**
 * Created by Shiva on 7/28/2017.
 */

class Employee {
    private int id;
    private String firstname;
    float salary = 40000;

    void name() {
        System.out.println("Hello Java");
    }
}


public class Programmer extends Employee {

    private int id;
    private String firstname;

    int bonus = 10000;

    public static void main(String[] args) {

        Programmer p = new Programmer();

        Employee e = new Employee();
        e.name();

        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}
