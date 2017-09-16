package OOP.Inheritance;

/**
 * Created by Shiva on 7/28/2017.
 */

class Employee {
    float salary = 40000;
}

public class Programmer extends Employee {



    public static void main(String args[]) {
        int bonus = 10000;
        Employee p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + bonus);
    }
}
