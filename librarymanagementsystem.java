interface functions {
    void checkout();
    void returnItem();
    boolean isAvailable();
    void displayDetails();
}
class Book implements functions {
    String title;
    String author;
    boolean available;
    int pageCount;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        available = true;
        this.pageCount = pageCount;
    }

    public void checkout() {
        if (available) {
            available = false;
            System.out.println("Checked out: " + title);
        } else {
            System.out.println(title + " is currently not available");
        }
    }

    public void returnItem() {
        available = true;
        System.out.println("Returned: " + title);
    }

    public boolean isAvailable() {
        return available;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}
public class librarymanagementsystem {
    public static void main(String[] args) {
        Book book1 = new Book("Head First Java", "Kathy Sierra, Bert Bates", 619);
        Book book2 = new Book("Let Us C++", " Yashavant Kanetkar", 362);

        System.out.println("Book 1 Details:");
        book1.displayDetails();
        book1.checkout();
        book1.displayDetails();
        book1.returnItem();
        book1.displayDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayDetails();
        book2.checkout();
        book2.displayDetails();
        book2.returnItem();
        book2.displayDetails();
    }
}
