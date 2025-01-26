package Chapter11.Classwork.Chapter11ObjectOriented.Challenge1.Solution;


public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("shiva", "USA", 10000, 30);
        Employee emp2 = new Employee("john", "USA", 50000, 25);
        System.out.println("Salary before raise: " + emp1.salary);
        emp1.raiseSalary();
        System.out.println("Salary after raise :" + emp1.salary);
        System.out.println("Salary of employee " + emp2.salary);
    }
}
