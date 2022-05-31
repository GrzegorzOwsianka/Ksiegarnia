public class GUI {
    void showMainMenu(){
        System.out.println("1. Pokaż książki");
        System.out.println("2. Kup książkę");
        System.out.println("3. Zakończ");
    }

    void showListOfBooks(Publication[] pub){
        for (Publication publ : pub){
            System.out.println("Autor: " + publ.getAuthor() +
                             ", Tytuł: " + publ.getTitle() +
                             ", ISBN: " + publ.getISBN() +
                             ", Data wydania: " + publ.getRelease() +
                             ", Ilość stron: " + publ.getPageNumber() +
                             ", Wydawnictwo: " + publ.getPublishingHouse() +
                             ", Ilość sztuk: " + publ.getCount() +
                             ", Rozmiar pliku: " + );

        }
    }
}
