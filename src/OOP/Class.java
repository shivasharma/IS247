package OOP;

/**
 * Created by Shiva on 7/28/2017.
 */
class Class {

    void showSum(float v, float x, float y, int count) {

        float sum = x + y;
        for (int i = 0; i < count; i++) {
            System.out.println(sum);
        }
        return;
    }

    void main(String args[]) {

        Class c = new Class();
        c.showSum(7.4f, 1, 4, 0);
        System.out.println("This is sum result");

        Flight BWI1 = new Flight();
        Flight BWI2 = new Flight();

        //this is jsut a flight reference
        Flight BWI3;


        if (BWI1.hasRoom(BWI2))
            BWI3 = BWI1.CreateNewWithBoth(BWI2);
    }

    class Flight {

        private int passengers;
        private int seat;

        public boolean hasRoom(Flight f2) {
            int total = passengers + f2.passengers;
            return total <= seat;
        }

        public Flight CreateNewWithBoth(Flight f2) {
            Flight newFlight = new Flight();
            newFlight.seat = seat;
            newFlight.passengers = passengers + f2.passengers;
            return newFlight;
        }
    }

}

