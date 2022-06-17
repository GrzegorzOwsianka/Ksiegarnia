public class GUI {
    void showMainMenu() {
        System.out.println("1. Pokaż książki");
        System.out.println("2. Kup książkę");
        System.out.println("3. Zakończ");
    }

    void listOfPublication() {
        for (Publication publications : DataBase.getInstance().getPublications()) {
                System.out.println(publications.toString());
        }
    }
}

