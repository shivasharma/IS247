package OOP.StringBuilderandBuffer;

/**
 * Created by Shiva on 7/9/2017.
 */
public class StringBuilderEg {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        StringBuffer buffer = new StringBuffer("hello");
        buffer.append("java using stringbuffer");

        System.out.println(buffer.append(new StringBuffer()));
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("hello");
        builder.append("java using string builder");
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);


        // conversion from StringBuilder object to String
        String str1 = builder.toString();
        System.out.println(str1);

        String s = "This is string";

        s.concat("It is IMMUTABLE");

        // s= s.concat("It is IMMUTABLE");
        System.out.println(s);

        s = s.concat(" This is concat result");

        System.out.println(s);
    }


}
    