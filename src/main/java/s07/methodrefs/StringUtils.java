package s07.methodrefs;

import java.util.List;

/** Section 7: the class from the method references question. */
public class StringUtils {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Cherry");

        // 1. Print each word
        words.forEach(s -> System.out.println(s));

        // 2. Get list of lengths
        List<Integer> lengths = words.stream()
            .map(s -> s.length())
            .toList();

        // 3. Create new String objects
        List<String> copies = words.stream()
            .map(s -> new String(s))
            .toList();
    }
}
