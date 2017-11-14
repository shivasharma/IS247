package JUnit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintGradesTest {
    @Test
    public void test() {
        PrintGrades pg = new PrintGrades();
        String result = pg.print(94);
        assertEquals("A", result);
    }

} 