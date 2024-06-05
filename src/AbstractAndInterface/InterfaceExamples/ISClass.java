package AbstractAndInterface.InterfaceExamples;

public class ISClass implements Student {
    @Override
    public void displayName() {
        System.out.println("I am Student name ISClass");
    }

    @Override
    public void getStudentNumber() {
        System.out.println("I am studnet number #1");
    }

    @Override
    public void getStandard() {
        System.out.println("I am IS major");
    }

    public void getCollegeinfo() {
        System.out.println("My college name is" + Student.college);
    }

}
