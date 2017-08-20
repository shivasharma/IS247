package OOP;

/**
 * Created by Shiva on 8/20/2017.
 */
public class StringBuilderVSStringBufferSpeed {


    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 100000; i++) {
            sb.append("Programming");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");


        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 100000; i++) {
            sb2.append("Programming");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }

}
