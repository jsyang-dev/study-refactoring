package magic_number;

import com.hyuki.refbook.StandardOutputTest;
import junit.framework.JUnit4TestAdapter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest extends StandardOutputTest {
    @Test public void testMain() {
        // Expected
        String expected = getExpectedOutput(
            "Andrew walks.",
            "Andrew stops.",
            "Andrew jumps.");

        // Actual
        Main.main(new String[0]);
        String actual = getActualOutput();

        // Assert
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
