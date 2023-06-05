package AbstractAndInterface.InterfaceExamples;

public class TestInterface {

    public static void main(String[] args) {
        Engineering eng = new Engineering();
        ISClass is = new ISClass();
        eng.displayName();
        eng.getStandard();
        eng.getStudentNumber();
        eng.getCollegeinfo();
        System.out.println("************************************");


        is.displayName();
        is.getStandard();
        is.getStudentNumber();
        is.getCollegeinfo();
    }
}
