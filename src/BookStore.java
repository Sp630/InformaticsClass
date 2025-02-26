import java.util.Scanner;
public class BookStore {
    public static void main(String[] args) {
        String[] titles = {"Spas", "Spas Vol. 2, The End of Spas", "Spas Vol. 3, Time to Spas", "A Spas out of Time, an Original Spas Story", "Ivan, an Original Spas Story"};
        double[] prices = {40, 30, 60, 60, 70};
        int[] quantity = {7, 3, 4, 5, 1};
        Display(titles, prices, quantity);
        System.out.println("Would you like to continue?[y/n]");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equals("y")){

            GetBook(titles, prices, quantity);
        }
        else {
            System.out.println("I don't like you either...");
            System.exit(0);
        }

        GetBook(titles, prices, quantity);
    }
    static void Display(String[] titles, double[] prices, int[] quantity) {
        for (int i = 0; i < titles.length; i++) {
            System.out.println("Title: " + titles[i]);
            System.out.println("Price: " + prices[i]);
            System.out.println("Quantity: " + quantity[i]);
        }
    }
    static void GetBook(String[] titles, double[] prices, int[] quantity) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        for (int i = 0; i < titles.length; i++) {
            boolean foundBook = false;
            if(title.equals(titles[i]) && quantity[i] > 0) {
                foundBook = true;
                System.out.println(" | Title: " + titles[i] + "\n | Price: " + prices[i] + "\n | Quantity: " + quantity[i]);
                System.out.println("Wanna buy? It will cost you...\nPrice: " + prices[i]);
                System.out.println("Drop cash: ");
                double cash = scanner.nextDouble();
                if(cash >= prices[i] && foundBook == false) {
                    System.out.println("Happy reading.\nReceived: " + titles[i]);
                }
                else {
                    System.out.println("Nuh-Uh... Not enough money...");
                    GetBook(titles, prices, quantity);
                }
            }
            else if(i == titles.length - 1) {
                System.out.print("Can't find your book. Might be out of stock.");
            }
        }

    }
}
