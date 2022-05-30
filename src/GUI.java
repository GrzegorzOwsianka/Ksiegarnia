public class GUI {
    void showMainMenu(){
        System.out.println("1. Pokaż książki");
        System.out.println("2. Kup książkę");
        System.out.println("3. Zakończ");
    }

    void showListOfBooks(Book[] books){
        for (Book book : books){
            System.out.println("Autor: " + book.getAuthor() +
                             ", Tytuł: " + book.getTitle() +
                             ", ISBN: " + book.getISBN() +
                             ", Data wydania: " + book.getRelease() +
                             ", Ilość stron: " + book.getPageNumber() +
                             ", Wydawnictwo: " + book.getPublishingHouse() +
                             ", Ilość sztuk: " + book.getCount());

        }
    }
}
