public class Book {
    private String title;
    private String author;
    private int year;
    private String status;
    private int totalBooks;

    public Book(String title, String author, int year, String status) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = status;
    }

    public Book(String status, String author, int year){
        this.status = status;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year + ", Status: " + status;
    }

    public int getTotalBooks() {
        return totalBooks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
