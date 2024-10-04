import java.util.Scanner;
public class Class24_09_24 {
    public static void main(String[] args) {
        double x = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number in cm: ");
        x = scanner.nextDouble();
        x *= 0.393701;
        System.out.println("Converted to inch: " + x);
    }
}
