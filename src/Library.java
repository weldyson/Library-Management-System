import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();  // Here I've declared a constructor
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book " + book.getTitle() + " added successfully");
    }

    public void  listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library");

        } else {
            System.out.println("\nList of Books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book '" + title + "' borrowed successfully!");
                    return;
                } else {
                    System.out.println("Book '" + title + "' is already borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book '" + title + "' not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book '" + title + "' returned successfully!");
                    return;
                } else {
                    System.out.println("Book '" + title + "' is already available.");
                    return;
                }
            }
        }
        System.out.println("Book '" + title + "' not found.");
    }
}



