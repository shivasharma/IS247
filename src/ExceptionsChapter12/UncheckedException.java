package ExceptionsChapter12;

/**
 * Created by Shiva on 9/13/2017.
 */
public class UncheckedException {

    public static void main(String[] args) {

        try {
            int i = 10 / 0;
            System.out.println(i);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
