package Generic.BoundedType;

import java.util.Arrays;
import java.util.List;

public class BoundClassandInterface {
    public void main(String[] args) {
        List<Integer> listInt = Arrays.asList(12, 55, 7, 9);
        IBound b = new CBound();
        getSortedDataBounded(b);
    }

    public <T extends IBound> void getSortedDataBounded(T list) {
    }

    interface IBound {
    }

    class CBound implements IBound {
    }
}


