package s03.aliasing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** Section 3: the test from the aliasing question. Remove @Disabled to run it. */
class TeamTest {
    @Disabled("Section 3: remove this line to see the test fail, then fix Team")
    @Test
    void teamKeepsItsOwnMembers() {
        List<String> names = new ArrayList<>(List.of("Ada", "Bob"));
        Team alpha = new Team("Alpha", names);

        names.clear();                       // reuse the list for the next team
        names.add("Eve");
        Team beta = new Team("Beta", names);

        assertEquals(List.of("Ada", "Bob"), alpha.getMembers());
        assertEquals(List.of("Eve"), beta.getMembers());
    }
}
