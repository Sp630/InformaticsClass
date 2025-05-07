import java.util.Scanner;
public class BookStore21_02_25 {
    public static void main(String[] args) {
        String[] titles = {"Spas", "Spas 2", "Spas 3", "A Spas Out of Time", "Ivan, an Original Spas Story"};
        double[] price = {20, 35.50, 40, 40, 37};
        int[] quantity = {20, 5, 30, 17, 21};
        Display(titles, price, quantity);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wanna buy?[Y/n]");
        String a = scanner.nextLine();
        if(a.equals("y")){
            SearchPurchase(titles, price, quantity);
        }
        else {
            System.out.println("I don't like you either...");
        }

    }
    static void Display(String[] titles, double[] price, int[] quantity){
        for(int i = 0; i < titles.length; i++){
            System.out.println("Title: " + titles[i]);
            System.out.println("Price: " + price[i]);
            System.out.println("Quantity: " + quantity[i]);

        }
    }
    static void SearchPurchase(String[] titles, double[] price, int[] quantity){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for a name: ");
        String name = scanner.nextLine();
        boolean got = false;
        for(int i = 0; i < titles.length; i++){
            if(titles[i].equalsIgnoreCase(name)) {
                got = true;
                System.out.println("Title: " + titles[i]);
                System.out.println("Price: " + price[i]);
                System.out.println("Quantity: " + quantity[i]);
                System.out.println("Wanna buy? It will cost you...\nDeposit cash...");
                double cash = scanner.nextDouble();
                if (cash == price[i]) {
                    System.out.println("Received: " + titles[i]);
                    quantity[i]--;
                }
                else if (cash > price[i]) {
                    System.out.println("Received: " + titles[i] + "\nThanks for the extra cash btw...");
                    quantity[i]--;
                }
                else {
                    System.out.println("Nuh-Uh...");
                }
            }
            else if (got == false && i == titles.length - 1) {
                System.out.println("No such product.");
            }
        }
    }
}
