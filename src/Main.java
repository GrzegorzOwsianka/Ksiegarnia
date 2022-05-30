import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        DataBase db = new DataBase();
        Scanner scanner = new Scanner(System.in);

        gui.showMainMenu();

        while(true){
            switch (scanner.nextLine()){
                case "1":
                    gui.showListOfBooks(db.books);
                    break;
                case"2":
                    System.out.println("Podaj numer ISBN: ");
                    System.out.print("Podaj ilość książek: ");
                    db.buyABook(getString(), getInt());
                    gui.showListOfBooks(db.books);
                case "3":
                    System.exit(0);
                    break;
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
