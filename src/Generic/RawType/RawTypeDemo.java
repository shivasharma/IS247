package Generic.RawType;

import java.util.List;

public class RawTypeDemo {
    public static void main(String[] args) {

        Box<Integer> genBox = new Box<>(List.of(1, 2, 3));
        for (Integer integer : genBox.getA()) {
            System.out.println(integer);
        }
        //This is raw type because we did not user <> here
        Box rawBox = new Box(List.of(1, 2, "test"));
        System.out.println(rawBox.getA());
    }
}
