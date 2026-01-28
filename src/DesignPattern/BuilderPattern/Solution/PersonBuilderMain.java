package DesignPattern.BuilderPattern.Solution;

import java.time.LocalDate;


public class PersonBuilderMain {

    public static void main(String[] args) {

        var person1 = new Person.PersonBuilder("Shiva", "Sharma")
                .dateOfBirth(LocalDate.of(1990, 2, 2))
                .middleName("na")
                .phoneNumber("23434433434")
                .emailAddress("abc@gmail.com")
                .build();
        addPersonToLeadTracker(person1);

        var person2 = new Person.PersonBuilder("John", "Doe")
                .dateOfBirth(LocalDate.of(1990, 1, 1))
                .middleName("na")
                .phoneNumber("23434433434")
                .build();
        addPersonToLeadTracker(person2);
    }


    private static void addPersonToLeadTracker(Person person) {
        System.out.println("A new lead was added to the lead tracker: \n" + person);
    }
}
