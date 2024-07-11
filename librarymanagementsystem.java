interface functions {
    void checkout();
    void returnitem();
    boolean isavailable();
    void displaydetails();
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

    public void returnitem() {
        available = true;
        System.out.println("Returned: " + title);
    }

    public boolean isavailable() {
        return available;
    }

    public void displaydetails() {
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
        book1.displaydetails();
        book1.checkout();
        book1.displaydetails();
        book1.returnitem();
        book1.displaydetails();

        System.out.println("\nBook 2 Details:");
        book2.displaydetails();
        book2.checkout();
        book2.displaydetails();
        book2.returnitem();
        book2.displaydetails();
    }
}
