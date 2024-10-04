import java.util.Scanner;

public class Class18_09_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your rating?");
        double rating = scanner.nextDouble();
        System.out.println("Rating: " + (int)(rating + 0.5));
    }
}
