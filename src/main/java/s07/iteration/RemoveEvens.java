package s07.iteration;

import java.util.List;

/** Section 7: the two methods from the iteration question. Try them on new ArrayList<>(List.of(...)). */
public class RemoveEvens {
    static void removeEvens(List<Integer> xs) {
        for (Integer x : xs) {
            if (x % 2 == 0) {
                xs.remove(x);
            }
        }
    }

    static void removeEvensByIndex(List<Integer> xs) {
        for (int i = 0; i < xs.size(); i++) {
            if (xs.get(i) % 2 == 0) {
                xs.remove(i);
            }
        }
    }
}
