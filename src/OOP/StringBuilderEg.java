package OOP;

/**
 * Created by Shiva on 7/9/2017.
 */
public class StringBuilderEg {
    public static void main(String args[]) {

        StringBuffer buffer = new StringBuffer("hello");
        buffer.append("java");

        System.out.println(buffer.append(new StringBuffer()));
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("hello");
        builder.append("java");
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);


        // conversion from StringBuilder object to String
        String str1 = builder.toString();
        System.out.println(str1);
    }


}
    