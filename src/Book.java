import java.time.LocalDate;

public class Book extends Publication{

    public Book() {
        super();
    }

    public Book(String author, String title, String ISBN, int year, int month, int day, int pageNumber, String publishingHouse, int count) {
        super(author,title,ISBN,year,month,day,pageNumber,publishingHouse,count);
    }
}
