package Chapter11.Refactor;

public class Refactor {
    private String name;
    private int age;
    private String major;

    // other attributes and methods...
    public void processStudentData() {
        // Step 1: Validate student data
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name");
            return;
        }
        if (age <= 0 || age > 100) {
            System.out.println("Invalid age");
            return;
        }
        if (major == null || major.isEmpty()) {
            System.out.println("Invalid major");
            return;
        }
        // Step 2: Perform calculations
        double averageGrade = calculateAverageGrade();
        String gradeLevel = calculateGradeLevel();
        // Step 3: Print student information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Grade Level: " + gradeLevel);
        // ... more print statements
        // Step 4: Perform additional actions
        if (averageGrade >= 90) {
            System.out.println("Congratulations on your excellent performance!");
        } else {
            System.out.println("Keep up the good work!");
        }
    }
}

