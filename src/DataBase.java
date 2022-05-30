import java.util.Scanner;

public class DataBase {
    Book[] books = new Book[4];
    private int countOfBuy;

    public DataBase() {
        this.books[0] = new Book("Cay S. Horstmann", "Java.Podstawy", "978-83-283-248-0", 2019, 11, 26, 768, "Helion", 10);
        this.books[1] = new Book("Robert C. Martin", "Czysty kod. Podręcznik dobrego programisty", "978-83-283-023-4-1", 2010, 02, 19, 424, "Helion", 8);
        this.books[2] = new Book("Eric Matthes", "Python. Instrukcje dla programisty.", "978-83-283-6360-1", 2020, 06, 02, 616, "Helion", 15);
        this.books[3] = new Book("Jerzy Grębosz", "Opus magnum C++ 11. Programowanie w języku C++.", "978-83-283-7102-6", 2020, 05, 26, 1648, "Helion", 20);
    }

    public int buyABook(String isbn, int count) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                countOfBuy = book.getCount() - count;
            }
        }
        System.out.println(countOfBuy);
        return countOfBuy;
    }
}
