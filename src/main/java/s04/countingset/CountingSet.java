package s04.countingset;

import java.util.Collection;
import java.util.HashSet;

/** Section 4: the CountingSet from the inheritance question. Counts how many elements have ever been added. */
public class CountingSet<E> extends HashSet<E> {
    private int addCount = 0;

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
