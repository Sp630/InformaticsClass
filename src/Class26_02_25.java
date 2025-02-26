import java.util.Scanner;


public class Class26_02_25 {
    public static void main(String[] args) {
        Book1[] books = {
                new Book1("Spas", "Spas", 2007),
                new Book1("Spas Vol. 2", "Spas", 2016),
                new Book1("Spas, Original Sin", "Spas", 2021, "Paco"),
                new Book1("Spas Vol. 3", "Spas", 2023)
        };
        Scanner scanner = new Scanner(System.in);
        DisplayLibrary(books);
        System.out.println("1 : Borrow; 2 : Return; 3 : Get Borrower Name; 4 : FindIndex");
        System.out.print("Enter action: ");
        int action = scanner.nextInt();
        switch (action) {
            case 1: BorrowBook(books);
                break;
            case 2: ReturnBook(books);
                break;
            case 3: GetBorrowerName(books);
                break;
            case 4: FindIndex(books);
                break;
        }
    }
    public static void DisplayLibrary(Book1[] books){
        for(Book1 book : books){
            book.DisplayDetails();
        }
    }
    public static void BorrowBook(Book1[] books){
        System.out.println("Enter title of book to borrow: ");
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        for(Book1 book : books){
            if(title.equalsIgnoreCase(book.title)){
                if(book.borrowerName.equalsIgnoreCase("None")){
                    System.out.println("Book available. Enter your name: ");
                    String name = input.nextLine();
                    book.BorrowBook(name);
                }
                else {
                    System.out.println("Book already borrowed.");
                }
            }
        }
    }
    public static void ReturnBook(Book1[] books){
        System.out.println("Enter title of book to return: ");
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        for(Book1 book : books){
            if(title.equalsIgnoreCase(book.title)){
                book.ReturnBook();
                System.out.println("Book returned.");
            }
        }
    }
    public static void GetBorrowerName(Book1[] books){
        System.out.println("Enter title of book to search: ");
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        for(Book1 book : books){
            if(title.equalsIgnoreCase(book.title)){
                System.out.println("Borrower name: " + book.borrowerName);
            }
        }
    }
    public static void FindIndex(Book1[] books){
        System.out.println("Enter title of book to return: ");
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        for(int i = 0; i < books.length; i++){
            if(title.equalsIgnoreCase(books[i].title)){
                System.out.println("Index: " + i);
            }
        }
    }
}


class Book1{
    String title;
    String author;
    int yearPublished;
    String borrowerName = "None";
    public Book1(String title, String Author, int yearPublished, String borrowerName){
        this.title = title;
        this.author = Author;
        this.yearPublished = yearPublished;
        this.borrowerName = borrowerName;
    }
    public Book1(String title, String Author, int yearPublished){
        this.title = title;
        this.author = Author;
        this.yearPublished = yearPublished;
        this.borrowerName = "None";
    }
    public void DisplayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Borrower Name: " + borrowerName);
    }
    public void UpdateBook(String newAuthor, String newTitle, int newYearPublished){
        this.author = newAuthor;
        this.title = newTitle;
        this.yearPublished = newYearPublished;
    }
    public void BorrowBook(String borrowerName){
        this.borrowerName = borrowerName;
    }
    public void ReturnBook(){
        borrowerName = "None";
    }
    public String getBorrowerName(){
        return borrowerName;
    }
}
