import java.util.Arrays;

public class DataBase {
    private final Publication[] publications = new Publication[6];
    private static final DataBase instance = new DataBase();
    private int countOfBuy;

    public DataBase() {
        this.publications[0] = new Book("Cay S. Horstmann", "Java.Podstawy", "978-83-283-248-0", 2019, 11, 26, 768, "Helion", 10);
        this.publications[1] = new Book("Robert C. Martin", "Czysty kod. Podręcznik dobrego programisty", "978-83-283-023-4-1", 2010, 02, 19, 424, "Helion", 12);
        this.publications[2] = new Book("Eric Matthes", "Python. Instrukcje dla programisty.", "978-83-283-6360-1", 2020, 06, 02, 616, "Helion", 15);
        this.publications[3] = new Book("Jerzy Grębosz", "Opus magnum C++ 11. Programowanie w języku C++.", "978-83-283-7102-6", 2020, 05, 26, 1648, "Helion", 20);

        this.publications[4] = new Ebook("Cay S. Horstmann", "Java.Podstawy", "978-83-283-248-1", 2020, 03, 07, 770, "Helion",17,"6.6Mb");
        this.publications[5] = new Ebook("Eric Matthes", "Python. Instrukcje dla programisty.", "978-83-283-6364-2", 2021, 04, 12, 620,"Helion",24,"7.0Mb");
    }

    public int buyABook(String isbn, int count) {
        for (Publication publication : this.publications)
            if (publication.getISBN().equals(isbn)) {
                if (publication.getCount() > 0 && count <= publication.getCount()) {
                    countOfBuy = publication.getCount() - count;
                    publication.setCount(countOfBuy);
                } else {
                    System.out.println("Brak książki lub za dużą ilość wprowadziłeś.");
                }
            }
        return countOfBuy;
    }

    public boolean IsISBN (String isbn) {
        for (Publication publication : this.publications) {
            if (publication.getISBN().equals(isbn)) {
                System.out.println("Podałeś właściwy ISBN książki. Teraz podaj ilość jaką chcesz kupić!");
                return true;
            }
        }
        return false;
    }

    public Publication[] getPublications () {
        return publications;
    }

    public static DataBase getInstance () {
        return instance;
    }
}
