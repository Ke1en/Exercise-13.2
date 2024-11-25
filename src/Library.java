import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Library {
    private ArrayList<Book> booksList = new ArrayList<>();
    private HashSet<Book> booksSet = new HashSet<>();
    private HashMap<Integer, Book> booksMap = new HashMap<>();

    public void addBook(Book book) {
        booksList.add(book);
        booksSet.add(book);
        booksMap.put(book.getId(), book);
    }

    public void removeBookById(int id) {
        for (Map.Entry<Integer, Book> newMap: booksMap.entrySet()) {
            if (newMap.getKey() == id) {
                booksMap.remove(newMap);
                booksSet.remove(newMap.getValue());
                booksList.remove(newMap.getValue());
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book books: booksList) {
            if (books.getTitle().equals(title)) {
                System.out.println(books);
            }
        }
        return null;
    }

    public void listAllBooks() {
        booksList.forEach(System.out::println);
    }

    public void listBooksByAuthor(String author) {
        booksSet.stream()
                .filter(book -> book.getAuthor()
                        .equalsIgnoreCase(author))
                .forEach(System.out::println);
    }
}
