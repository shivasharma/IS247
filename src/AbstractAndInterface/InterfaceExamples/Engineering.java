package AbstractAndInterface.InterfaceExamples;

public class Engineering implements Student {
    public void displayName() {
        System.out.println(" I am Student name Engineering ");
    }

    @Override
    public void getStudentNumber() {
        System.out.println(" I am student number #2 ");
    }

    @Override
    public void getStandard() {
        System.out.println("I am Engineering major ");
    }

    public void getCollegeinfo() {
        System.out.println(" My college name is UMD ");
    }

}
