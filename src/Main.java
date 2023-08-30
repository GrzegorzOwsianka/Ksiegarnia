import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        DataBase db = DataBase.getInstance();
        Scanner scanner = new Scanner(System.in);

        while(true){
            gui.showMainMenu();
            switch (scanner.nextLine()) {
                case "1" -> gui.listOfPublication();
                case "2" -> {
                    System.out.println("Podaj numer ISBN: ");
                    String isbn = getString();
                    if (!db.IsISBN(isbn)) {
                        System.out.println("Nie ma takiego ISBN");
                    } else {
                        System.out.println("Podaj ilość: ");
                        int number = getInt();
                        db.buyABook(isbn, number);
                    }
                }
                case "3" -> System.exit(0);
                default -> {
                }
            }
        }

    }
    public static String getString() {
        return new Scanner(System.in).next();
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
