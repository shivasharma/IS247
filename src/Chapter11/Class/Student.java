package Chapter11.Class;

public class Student {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Student() {

    }

    public Student(String fname, String lname, String phone) {
        //this reprents to instance data= calling program
        // it has same  name
        this.firstName = fname;
        this.lastName = lname;
        this.phoneNumber = phone;
    }

    //gettter:Accessor
    public String getName() {
        return firstName + " " + lastName;
    }

    //setter: Mutator
    public void setFirstName(String value) {
        firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        lastName = value;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String value) {
        phoneNumber = value;
    }

    public void printStudentInfo() {
        System.out.println(lastName + ", " + firstName + "\nPhoneNumber: " + phoneNumber + "\n");
        System.out.println();
    }
}
