package JUnit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintGradesTest {
    @Test
    public void should_Print_A() {


        PrintGrades pg = new PrintGrades();
        String result = pg.print(94);
        assertEquals("A", result);
    }

    @Test
    public void should_return_name() {
        PrintGrades pg = new PrintGrades();

        String expected = "Shiva";
        String actual = "Shiva";
        assertEquals(expected, actual);
    }

} 