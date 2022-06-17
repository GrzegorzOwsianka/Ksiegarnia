public class Ebook extends Book{
    private String sizeOfPdf;

    public Ebook() {
        super();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getCount() > 0){
            sb.append(super.toString() + ", Rozmiar pliku PDF:")
                    .append(this.getSizeOfPdf());
            return sb.toString();
        } else {
            sb.append(super.toString());
        }
        return sb.toString();
    }
}


