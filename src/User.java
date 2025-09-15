import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    public ArrayList<Book> booksBorrowed = new ArrayList<>();

    public User(String name) {
        this.name = name;
        this.booksBorrowed = new ArrayList<>();

    }

    public void addBook(Book book) {
        if(book!=null){
            booksBorrowed.add(book);
        }
    }

    public String getName() {
        return name;
    }
}