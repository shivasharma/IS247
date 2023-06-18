package Generic.BoundedType;

import java.util.Arrays;
import java.util.List;

public class BoundClassandInterface {
    public void main(String[] args) {
        List<Integer> listInt = Arrays.asList(12, 55, 7, 9);
        IBound1 b = new CBound();
        getSortedDataSingelBound(b);

        CBound1 b1 = new CBound1();
        getSortedDataMultipleBound(b1);


    }

    public <T extends IBound1> void getSortedDataSingelBound(T list) {
    }

    public <T extends IBound1 & IBound2> void getSortedDataMultipleBound(T list) {
    }

    interface IBound1 {
    }

    interface IBound2 {
    }

    class CBound implements IBound1 {
    }

    class CBound1 implements IBound1, IBound2 {
    }
}


