package s06.testlifecycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** Section 6: the test from the JUnit lifecycle question. Remove @Disabled to run it. */
@Disabled("Section 6: remove this line to run the question's test")
class CounterTest {
    private static List<String> seen = new ArrayList<>();
    private List<String> mine = new ArrayList<>();

    @Test
    void first() {
        seen.add("first");
        mine.add("first");
        assertEquals(1, mine.size());
    }

    @Test
    void second() {
        seen.add("second");
        mine.add("second");
        assertEquals(1, mine.size());
        assertEquals(1, seen.size());
    }
}
