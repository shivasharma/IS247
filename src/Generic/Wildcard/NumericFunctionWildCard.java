package Generic.Wildcard;

public class NumericFunctionWildCard<T extends Number> {


    T num;

    NumericFunctionWildCard(T obj) {
        this.num = obj;
    }

    public static void main(String[] args) {
        NumericFunctionWildCard<Integer> num0 = new NumericFunctionWildCard<>(6);
        NumericFunctionWildCard<Integer> num1 = new NumericFunctionWildCard<>(6);
        NumericFunctionWildCard<Double> num2 = new NumericFunctionWildCard<>(-6.0);
        NumericFunctionWildCard<Float> num3 = new NumericFunctionWildCard<>(-6.0f);
        NumericFunctionWildCard<Number> num4 = new NumericFunctionWildCard<>(-6.0f);

        // num1.absEqualType(num1);
        System.out.println(num1.absEqualUnknown(num2));
        System.out.println(num1.absEqualUnknown(num3));
        System.out.println(num1.absEqualUnknown(num4));
    }

    boolean absEqualType(NumericFunctionWildCard<T> obj) {
        return Math.abs(num.doubleValue()) == Math.abs(obj.num.doubleValue());
    }

    boolean absEqualUnknown(NumericFunctionWildCard<?> obj) {
        return Math.abs(num.doubleValue()) == Math.abs(obj.num.doubleValue());
    }
}


