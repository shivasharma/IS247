package Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RawTypeGeneric {

    public void main(String[] args) {
        rawTypeIssue();
        withRawType();
        withParameterizedType();

    }

    void withRawType() {
        //Raw List doesn't self-document,
        //doesn't state explicitly what it can contain
        List languages = Arrays.asList("Java", "C#", "Python");

        Iterator iter = languages.iterator();
        while (iter.hasNext()) {
            String language = (String) iter.next(); //cast needed
            log(languages);
        }
    }

    void withParameterizedType() {
        List<String> languages = Arrays.asList("Java", "C#", "Python");
        for (String language : languages) {
            log(language);
        }
    }

    private void log(Object aMessage) {
        System.out.println(aMessage);
    }

    private void rawTypeIssue() {
        List names = new ArrayList(); 
        names.add("John");
        names.add("Mary");
        names.add(Boolean.FALSE);
        System.out.println(names);
        System.out.println("test");
    }


}
