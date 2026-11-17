package s09.optional;

import java.util.HashMap;
import java.util.Map;

/** Section 9: the class from the Optional question. */
public class Directory {
    private final Map<String, String> emails = new HashMap<>();

    public void add(String crsid, String email) {
        emails.put(crsid, email);
    }

    // Returns null if there is no such user
    public String findEmail(String crsid) {
        return emails.get(crsid);
    }
}
