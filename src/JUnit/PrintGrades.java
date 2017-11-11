package JUnit;

public class PrintGrades {

    public String print(int grade) {
        if (grade > 93)
            return "A";
        else if (grade > 83)
            return "B";
        else if (grade > 73)
            return "C";
        else
            return "You failed";
    }
}
