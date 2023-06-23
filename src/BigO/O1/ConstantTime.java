package BigO.O1;

public class ConstantTime {

    public static int sum(int a, int b) {
        int total = a + b;
        return total;
    }

    public static void main(String[] args) {
        int sum = sum(10, 20);
        System.out.println(sum);
    }
}
