class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Assign03 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "Herbert Schildt", 550);
        Book b2 = new Book("Effective Java", "Joshua Bloch", 750);

        System.out.println("=== Book 1 ===");
        b1.displayDetails();

        System.out.println("\n=== Book 2 ===");
        b2.displayDetails();
    }
}
