public class ClassPractice {
    public static void main(String[] args) {
        // Task 4: Create two or more Book objects with different attributes.
        Book book1 = new Book("Super-Spas", "Spas Gaiman", 1546);
        Book book2 = new Book("A Spas Story", "Saps Flaperman", 1235);
        Book book3 = new Book("Frankenspas", "Spas Shelley", 15);
        // Task 5: Call the displayDetails method for each object.
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}

// Define the Book class
class Book {
    // Task 1: Add three attributes: title, author, and numberOfPages.
    private String title;
    private String author;
    private int numberOfPages;

    // Constructor
    public Book(String title, String author, int numberOfPages) {
        // Task 2: Initialize the attributes inside this constructor.
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    // Task 3: Add a method displayDetails() to print the book's details (title, author, and numberOfPages).
    public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberOfPages);
    }
}
