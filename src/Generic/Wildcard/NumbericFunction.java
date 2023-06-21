package Generic.Wildcard;

public class NumbericFunction<T extends Number> {


    T num;

    NumbericFunction(T obj) {
        this.num = obj;
    }

    public static void main(String[] args) {
        NumbericFunction<Integer> num1 = new NumbericFunction<>(6);
        NumbericFunction<Double> num2 = new NumbericFunction<>(-6.0);
        //num1.absEqualType(num2);
        num1.absEqualUnknown(num1);
    }

    boolean absEqualType(NumbericFunction<T> obj) {
        return Math.abs(num.doubleValue()) == Math.abs(obj.num.doubleValue());
    }

    boolean absEqualUnknown(NumbericFunction<?> obj) {
        return Math.abs(num.doubleValue()) == Math.abs(obj.num.doubleValue());
    }
}


