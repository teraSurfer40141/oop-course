package s03.aliasing;

import java.util.List;

/** Section 3: the Team class from the aliasing question. */
public class Team {
    private final String name;
    private final List<String> members;

    public Team(String name, List<String> members) {
        this.name = name;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public Team renamed(String newName) {
        return new Team(newName, members);
    }
}
