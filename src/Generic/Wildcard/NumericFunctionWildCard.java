package Generic.Wildcard;

public class NumericFunctionWildCard<T extends Number> {


    T num;

    NumericFunctionWildCard(T obj) {
        this.num = obj;
    }

    public static void main(String[] args) {
        NumericFunctionWildCard<Integer> num1 = new NumericFunctionWildCard<>(6);
        NumericFunctionWildCard<Double> num2 = new NumericFunctionWildCard<>(-6.0);
        //num1.absEqualType(num2);
        num1.absEqualUnknown(num1);
    }

    boolean absEqualType(NumericFunctionWildCard<T> obj) {
        return Math.abs(num.doubleValue()) == Math.abs(obj.num.doubleValue());
    }

    boolean absEqualUnknown(NumericFunctionWildCard<?> obj) {
        return Math.abs(num.doubleValue()) == Math.abs(obj.num.doubleValue());
    }
}


