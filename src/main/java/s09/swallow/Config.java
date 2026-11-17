package s09.swallow;

/** Section 9: the method from the swallowed exception question. */
public class Config {
    static final int DEFAULT_PORT = 8080;

    static int parsePort(String setting) {
        try {
            return Integer.parseInt(setting.trim());
        } catch (Exception e) {
            // ignore and use the default
        }
        return DEFAULT_PORT;
    }
}
