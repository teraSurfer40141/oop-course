package s10.apples;

import java.util.ArrayList;
import java.util.List;

/** Section 10: the code from the apples question. */
public class Apples {
    record Apple(String colour, int weight) {}

    interface ApplePredicate {
        boolean test(Apple a);
    }

    static class HeavyApples implements ApplePredicate {
        public boolean test(Apple a) { return a.weight() > 150; }
    }

    static class GreenApples implements ApplePredicate {
        public boolean test(Apple a) { return a.colour().equals("green"); }
    }

    static List<Apple> filterApples(List<Apple> apples, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple a : apples) {
            if (p.test(a)) result.add(a);
        }
        return result;
    }

    // filterApples(inventory, new HeavyApples())
}
