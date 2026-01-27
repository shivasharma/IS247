package DesignPattern.BuilderPattern.Problem;

import java.time.LocalDate;

public class SalesLeadTracker {

    public static void main(String[] args) {


        var person1 = new SalesPerson("Tracy", null,
                "Westbay", LocalDate.of(1985, 1, 1),
                "tracy@example.com", null);

        addPersonToLeadTracker(person1);
        System.out.println("----------------------------------------------");
        var person2 = new SalesPerson("Jerome", "Henry",
                "Donaldson", null,
                null, "123456789");

        addPersonToLeadTracker(person2);
        System.out.println("----------------------------------------------");
    }

    private static void addPersonToLeadTracker(SalesPerson person) {
        System.out.println("A new lead was added to the lead tracker: \n" + person);
    }

}