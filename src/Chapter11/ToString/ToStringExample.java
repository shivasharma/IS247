package Chapter11.ToString;

class Employee {
    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public String toString() {
        return ("Employee ID" + id + "." + "Name " + name);
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Shiva Sharma");
        Employee emp2 = new Employee(2, "John doe");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
/*
If toString() method is commented it will print the
 class name followed by a hash code, which is a unique identifier for all
your objects in Java.
 */