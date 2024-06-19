package Generic.Wildcard;

import java.util.Arrays;
import java.util.List;

public class WildcardSimpleExample {
    public static void print(List<Object> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void printwildcard(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
// List<object> is not a super class of List<Integer>
        print(nums);
        printwildcard(nums);

    }
}
