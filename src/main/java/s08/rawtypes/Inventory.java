package s08.rawtypes;

import java.util.ArrayList;
import java.util.List;

/** Section 8: the class from the raw types question. */
public class Inventory {
    private List items = new ArrayList();           // raw type

    @SuppressWarnings("unchecked")
    public void add(String item) {
        items.add(item);
    }

    public String first() {
        return (String) items.get(0);
    }

    public List getItems() {                         // raw type leaks out
        return items;
    }
}
