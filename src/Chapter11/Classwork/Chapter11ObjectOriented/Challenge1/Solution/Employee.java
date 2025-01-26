package Chapter11.Classwork.Chapter11ObjectOriented.Challenge1.Solution;

public class Employee {
    public double salary;
    String name;
    String location;
    int age;

    public Employee(String name, String location, double salary, int age) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.salary = salary;
    }

    public void raiseSalary() {
        this.salary = salary + 5000;
    }
}
