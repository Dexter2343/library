import java.util.ArrayList;

public class Library extends User {
    private static ArrayList<Book> totalBooks = new ArrayList<Book>();

    public Library(String name) {
        super(name);
    }

    // Статичний метод для підрахунку книг
    public static void totalBooksCounterInLibrary() {
        if (totalBooks.isEmpty()) {
            System.out.println("Список книг порожній.");
        } else {
            System.out.println("Кількість книг сягає " + totalBooks.size() + " шт.");
        }
    }

    public void countBorrowedBooks() {
        System.out.println("Кількість позичених книг сягає " + booksBorrowed.size() + " шт.");
    }

    // Геттер для списку книг
    public static ArrayList<Book> getTotalBooks() {
        return totalBooks;
    }

    // Метод для додавання книги до списку
    public static void addBooks(Book book) {
        totalBooks.add(book);
    }


    public void issueBook(Book book) {
       totalBooks.removeLast();
        System.out.println("Видана книга для користувача");
        System.out.println("Бібліотека має зараз " + totalBooks.size() + " книг");
    }

    // Метод для повертання книг в бібіліотеку
    public void returnBook(Book book) {
        totalBooks.add(book);
        System.out.println("В бібліотеку повернено книгу, на даний момент бібліотека має "
                + totalBooks.size() + " книг");
        booksBorrowed.removeLast();
        System.out.println("На зараз всього позичених книг " + booksBorrowed);
    }


}