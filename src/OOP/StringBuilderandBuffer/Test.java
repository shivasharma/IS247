package OOP.StringBuilderandBuffer;

public class Test {
    public static void main(String[] args) {
        // Initialize a string using StringBuilder constructor
        System.out.println("==============================================");
        System.out.println("Using StringBuilder");
        System.out.println("==============================================");
        StringBuilder stringBuilder = new StringBuilder("Welcome to IS247!");
        System.out.println("Using stringbuilder contructor => " + stringBuilder);
        // Utilize methods from StringBuilder
        stringBuilder.replace(0, 7, "Programming"); // Replace "World" with "Java"
        System.out.println("Using stringbuilder replace => " + stringBuilder);

        stringBuilder.reverse(); // Reverse the string
        System.out.println("Using stringbuilder reverse => " + stringBuilder);

        stringBuilder.append(" Welcome!"); // Append " Welcome!" to the string
        System.out.println("Using stringbuilder append => " + stringBuilder);

        stringBuilder.insert(0, "Greetings: "); // Insert "Greetings: " at the beginning of the string
        System.out.println("Using stringbuilder insert => " + stringBuilder);
        // Print the string using toString() method

        String stringbuffersubstring = stringBuilder.substring(0, 15); // Get substring from index 0 to 9
        System.out.println("Using stringbuilder substring => " + stringbuffersubstring);

        stringBuilder.trimToSize(); // Trim the underlying character array to the string's length
        System.out.println("Using trimToSize => " + stringBuilder);

        stringBuilder.delete(0, 10); // Delete characters from index 0 to 9
        System.out.println("Using delete => " + stringBuilder);
        System.out.println("==============================================");
        // Initialize a string using StringBuffer constructor

        System.out.println("==============================================");
        System.out.println("using StringBuffer");
        StringBuilder stringBuffer = new StringBuilder("Welcome to IS247!");
        System.out.println("Using stringBuffer contructor => " + stringBuffer);
        // Utilize methods from StringBuilder
        stringBuffer.replace(0, 7, "Programming"); // Replace "World" with "Java"
        System.out.println("Using stringBuffer replace => " + stringBuffer);

        stringBuffer.reverse(); // Reverse the string
        System.out.println("Using stringBuffer reverse => " + stringBuilder);

        stringBuffer.append(" Welcome!"); // Append " Welcome!" to the string
        System.out.println("Using stringBuffer append => " + stringBuffer);

        stringBuffer.insert(0, "Greetings: "); // Insert "Greetings: " at the beginning of the string
        System.out.println("Using stringBuffer insert => " + stringBuffer);
        // Print the string using toString() method

        String stringBufferString = stringBuffer.substring(0, 15); // Get substring from index 0 to 9
        System.out.println("Using stringBuffer substring => " + stringBufferString);

        stringBufferString.trim(); // Trim the underlying character array to the string's length
        System.out.println("Using stringBuffer trim => " + stringBufferString);

        stringBuffer.replace(0, 9, "Hello"); // Delete characters from index 0 to 9
        System.out.println("Using stringBuffer replace => " + stringBuffer);
        System.out.println("==============================================");
    }
}
