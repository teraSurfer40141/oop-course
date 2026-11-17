package s07.books;

import java.util.List;

/** Section 7: the data from the streams question. */
public class Books {
    public record Book(String title, String author, int pages) {}

    public static List<Book> library() {
        List<Book> library = List.of(
            new Book("Moby Dick", "Herman Melville", 720),
            new Book("1984", "George Orwell", 328),
            new Book("Ulysses", "James Joyce", 730),
            new Book("War and Peace", "Leo Tolstoy", 1225)
        );
        return library;
    }
}
