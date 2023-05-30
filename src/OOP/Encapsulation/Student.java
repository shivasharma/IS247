package OOP.Encapsulation;

/**
 * Created by Shiva on 7/29/2017.
 */
public class Student {
    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("Please enter the valid age");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
