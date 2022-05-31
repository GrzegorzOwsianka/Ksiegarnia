import java.time.LocalDate;

public class Ebook extends Publication{
    private String sizeOfPdf;

    public Ebook() {
    }

    public Ebook(String author, String title, String ISBN, int year, int month, int day, int pageNumber, String publishingHouse, int count, String sizeOfPdf) {
        super(author, title, ISBN, year, month, day, pageNumber, publishingHouse, count);
        this.sizeOfPdf = sizeOfPdf;
    }

    public String getSizeOfPdf() {
        return sizeOfPdf;
    }

    public void setSizeOfPdf(String sizeOfPdf) {
        this.sizeOfPdf = sizeOfPdf;
    }
}

