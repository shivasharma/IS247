package OOP.Encapsulation;

/**
 * Created by Shiva on 7/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Shiva Sharma");
        s.setAge(70);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }

}

