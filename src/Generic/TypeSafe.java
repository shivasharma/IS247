package Generic;

import java.util.ArrayList;

public class TypeSafe {
    public static void main(String[] args) {
        //withoutGeneric();
        withGeneric();
    }

    private static void withoutGeneric() {
        //This list consist of both int and string
        ArrayList list = new ArrayList();
        list.add("IS247");
        list.add("IS147");
        list.add(1);

        for (Object object : list) {
            String str = (String) object;
        }
    }

    private static void withGeneric() {
        ArrayList<String> list = new ArrayList<>();
        list.add("IS247");
        list.add("IS147");
        for (String object : list) {
            String str = object;
            System.out.println(str);
        }
    }
}
