package Generic;


class Stats<T extends Number> {

    T[] n1;

    //constructor
    Stats(T[] o) {
        n1 = o;
    }

    double avg() {
        double sum = 0.0;
        for (int i = 0; i < n1.length; i++) {
            sum += n1[i].doubleValue();

        }
        return sum;
    }
}

public class BoundedTypeGeneric {


    public static void main(String[] args) {

        Integer i1[] = {10, 20, 30, 40};
        Stats<Integer> i = new Stats<Integer>(i1);
        double op = i.avg();
        System.out.println("Average is" + op);
    }


}

