import java.util.Scanner;

public class Class25_09_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Dear " + name + ", stop it. Get some help. You are just " + age + " years old.");


    }
}
