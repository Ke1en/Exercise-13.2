/*
Задача: Управление библиотекой
Вам нужно разработать систему управления библиотекой. В библиотеке есть книги, каждая из которых имеет уникальный
идентификационный номер, название и автора.
Требования:
        1. Создайте класс Book, который будет представлять книгу.
        - Поля: id (тип int), title (тип String), author (тип String).
        - Методы: Конструктор для инициализации полей, геттеры и сеттеры, метод toString() для вывода информации о книге.
        2. Создайте класс Library, который будет управлять книгами.
        - Поля: booksList (тип ArrayList<Book>), booksSet (тип HashSet<Book>), booksMap (тип HashMap<Integer, Book>).
        - Методы:
        - addBook(Book book): добавляет книгу в библиотеку.
        - removeBookById(int id): удаляет книгу по её идентификационному номеру.
        - findBookByTitle(String title): ищет книгу по названию и возвращает её.
     - listAllBooks(): выводит список всех книг.
        - listBooksByAuthor(String author): выводит список книг конкретного автора.
3. Создайте класс Main с методом main, где протестируете работу вашего приложения:
        - Добавьте несколько книг в библиотеку.
        - Удалите книгу по ID.
        - Найдите книгу по названию.
        - Выведите все книги и книги конкретного автора.

        Подсказка:
        -ArrayList для хранения всех книг, чтобы легко получать доступ к книгам по индексу.
        - HashSet для хранения уникальных книг (например, если вы хотите избежать дубликатов).
        - HashMap для хранения книг с ключом в виде их уникального ID, что позволит быстро находить книги по их идентификаторам.

        Совет:переопределите equals и hashcode=)
*/

public class Main {
    public static void main(String[] args) {
        Library bookLibrary = new Library();
        bookLibrary.addBook(new Book(1, "TBATE", "TurtleME"));
        bookLibrary.addBook(new Book(2, "MEMEME", "Someone"));
        bookLibrary.addBook(new Book(3, "TestName", "TestAuthor"));
        bookLibrary.addBook(new Book(4, "NONAME", "TurtleME"));

        System.out.println("\nList all books: ");
        bookLibrary.listAllBooks();

        bookLibrary.removeBookById(2);

        System.out.println("\nList all books (after delete): ");
        bookLibrary.listAllBooks();

        System.out.println("\nBooks by title:");
        bookLibrary.findBookByTitle("MEMEME");
        bookLibrary.findBookByTitle("TBATE");

        System.out.println("\nList books by author");
        bookLibrary.listBooksByAuthor("TurtleME");
    }
}