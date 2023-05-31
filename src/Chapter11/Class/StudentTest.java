package Chapter11.Class;


public class StudentTest {
    public static void main(String[] args) {
        Student is247Student = new Student("Shiva", "Sharma", "4343343435");
        String getlastname = is247Student.getLastName();
        System.out.println(getlastname);
        is247Student.printStudentInfo();

    }
}
