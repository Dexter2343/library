public class Main {
    public static void main(String[] args) {
//        User user = new User("John");
//        Book books = new Book("as", "asd", 1990);
//
//        for(Book book:user.getBooksBorrowed()){
//            System.out.println("Book: " + book.getTitle() + " " + book.getAuthor() + " " + book.getYear());
//        }



        Library library = new Library("Library");

//        Список всіх книг(виводжу через клас бо метод статичний)
        Library.addBooks(new Book("Вільна","sdfgfdx",1339));
        Library.addBooks(new Book("Вільна","sdfgfdx",1339));
        Library.addBooks(new Book("Вільна","sdfgfdx",1339));
        Library.totalBooksCounterInLibrary();

//          Тут список книг які були позичені
//        library.addBook(new Book("fdds", "sdfds", 1876, "Borrowed"));
//        library.addBook(new Book("fdds", "sdfds", 1876, "Borrowed"));
//        library.addBook(new Book("fdds", "sdfds", 1876, "Borrowed"));
//        library.addBook(new Book("fdds", "sdfds", 1876, "Borrowed"));
//        library.addBook(new Book("fdds", "sdfds", 1876, "Borrowed"));//
//        library.countBorrowedBooks();

        library.issueBook(new Book("fdds", "sdfds", 1876));
        library.returnBook(new Book("fdds", "sdfds", 1876));

//        Book book = new Book("fdds", "sdfds", 1876, "Borrowed");
//        System.out.println(book.toString());





    }
}