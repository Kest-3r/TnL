package Viva2;
import java.util.ArrayList;
import java.util.Scanner;

public class Viva2Q3 {

        private static final  ArrayList<String> bookTitles = new ArrayList<>();
        private static final  ArrayList<String> bookAuthors = new ArrayList<>();
        private static final  Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            while (true) {
                System.out.println("\nChoose an action:");
                System.out.println("1. Add a book");
                System.out.println("2. View book details");
                System.out.println("3. View all books");
                System.out.println("4. Exit");
                System.out.print("Choice of action: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the leftover line by Int

                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        viewBookDetails();
                        break;
                    case 3:
                        viewAllBooks();
                        break;
                    case 4:
                        System.out.println("Program ending...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }

        public static void addBook() {
            System.out.print("\nEnter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter book author: ");
            String author = scanner.nextLine();
            bookTitles.add(title);
            bookAuthors.add(author);
            System.out.println("Book added successfully!");
        }

        public static void viewBookDetails() {
            System.out.print("\nEnter book title: ");
            String title = scanner.nextLine();

            //search the book by title
            for (int i = 0; i < bookTitles.size(); i++) {
                if (bookTitles.get(i).equalsIgnoreCase(title)) {
                    System.out.println("Book Details: " + bookTitles.get(i) + " by " + bookAuthors.get(i));
                    return;
                }
            }
            System.out.println("Book not found.");
        }

        public static void viewAllBooks() {
            if (bookTitles.isEmpty()) {
                System.out.println("\nNo books available.");
            } else {
                System.out.println("Books in the system:");
                for (int i = 0; i < bookTitles.size(); i++) {
                    System.out.println(bookTitles.get(i) + " by " + bookAuthors.get(i));
                }
            }
        }
}

