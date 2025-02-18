import java.util.Scanner;
public class Class18_02_25 {
    public static void main(String[] args) {
        String[] items = {"Cola", "Pepsi", "Ice tea", "Snickers", "Water"};
        double[] price = {2.00, 1.50, 2.50, 2.00, 1.00};
        int[] quantity = {2, 3, 4, 5, 7};
        DisplayItems(items, price, quantity);
        System.out.println("Would you like to continue?[y/n]");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equals("y")){

            Purchase(items, price, quantity);
        }
        else {
            System.out.println("I don't like you either...");
            System.exit(0);
        }


    }
    static void DisplayItems(String[] items, double[] price, int[] quantity){
        for(int i = 0; i < items.length; i++){
            System.out.println("Item: " + items[i]);
            System.out.println("Price: " + price[i] + "lv");
            System.out.println("Quantity: " + quantity[i]);
        }
    }
    static void Purchase(String[] items, double[] price, int[] quantity){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item code: ");
        int index = scanner.nextInt();
        for(int i = 0; i < items.length; i++){
            if(i == index && quantity[i] > 0){
                System.out.println("Item: " + items[i]);
                System.out.println("Price: " + price[i] + "lv");
                System.out.println("Drop cash: ");
                double cash = scanner.nextDouble();
                if (cash == price[i]){
                    System.out.println("Received: " + items[i]);
                    quantity[i] -= 1;
                }
                else if(cash > price[i]){
                    System.out.println("Received: " + items[i]);
                    quantity[i] -= 1;
                    System.out.println("Thx for the extra cash btw");
                }
                else {
                    System.out.println("Nuh-Uh, not enough cash...");
                    Purchase(items, price, quantity);
                }
            }
        }
    }
}
