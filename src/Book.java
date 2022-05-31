import java.time.LocalDate;

public class Book {
    private String author;
    private String title;
    private String ISBN;
    private LocalDate release;
    private int pageNumber;
    private String publishingHouse;
    private int count;

    public Book() {
    }

    public Book(String author, String title, String ISBN, int year, int month, int day, int pageNumber, String publishingHouse,int count) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.release = LocalDate.of(year,month,day);
        this.pageNumber = pageNumber;
        this.publishingHouse = publishingHouse;
        this.count = count;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCount() {return count;}

    public void setCount(int count) {
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
}
