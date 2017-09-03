package Generic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RawTypeGeneric {

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
        System.out.println(String.valueOf(aMessage));
    }
}
