import java.math.MathContext;
import java.util.Scanner;
import java.util.Random;
public class Class16_10_24 {
    public static void main(String[] args) {
        NumberGame numberGame = new NumberGame();
        numberGame.Play();
    }


}

class NumberGame {
    void Play() {
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * 10);
        System.out.println("Guess the number: ");
        int input = sc.nextInt();
        if (input == num) {
            System.out.println("Correct! The number is " + num + ".");
        } else {
            if (input < num) {
                System.out.println("Wrong! The number is bigger.");
            } else if (input > num) {
                System.out.println("Wrong! The number is smaller.");
            }
            System.out.println("Guess the number: ");
            input = sc.nextInt();
            if (input == num) {
                System.out.println("Correct! The number is " + num + ".");
            } else {
                if (input < num) {
                    System.out.println("Wrong! The number is bigger.");
                } else if (input > num) {
                    System.out.println("Wrong! The number is smaller.");
                }
                System.out.println("Guess the number: ");
                input = sc.nextInt();
                if (input == num) {
                    System.out.println("Correct! The number is " + num + ".");
                } else {
                    System.out.println("Wrong! You failed to guess the number. The number is " + num + ".");
                }


            }
        }
    }
}
class Quiz{
    void Start(){
        System.out.println("Choose category: ");
        Scanner scanner = new Scanner(System.in);
        int category = scanner.nextInt();
        switch (category){
            case 1:
                System.out.println("What is the chemical formula of water?");
                String answer = scanner.next();
                if(answer.equals("H2O")){
                    System.out.println("Correct! +1 point");
                }
                else {
                    System.out.println("Incorrect!");
                }
            case 2:
                System.out.println("Which Bulgarian ruler established the first written laws?");
                String answer1 = scanner.next();
                if(answer1.equals("H2O")){
                    System.out.println("Correct! +1 point");
                }
                else {
                    System.out.println("Incorrect!");
                }
            case 3:
                System.out.println("Who is the best calisthenics athlete?");
                String answer2 = scanner.next();
                if(answer2.equals("Adrian")){
                    System.out.println("Correct! +1 point");
                }
                else {
                    System.out.println("Incorrect!");
                }

        }
    }
}
class VendingMachine{
    String code;
    void GetProduct(){
        System.out.println("Enter code: ");
        Scanner scanner = new Scanner(System.in);
        code = scanner.nextLine();
        this.code = code;
        switch (code){
            case "A1":
                System.out.println("Product: Soda - Price: $1.50");
                break;
            case "B2":
                System.out.println("Product: Chips - Price: $1.25");
                break;
            case "C3":
                System.out.println("Product: Candy - Price: $0.75");
                break;
            case "D4":
                System.out.println("Product: Water - Price: $1.00");
                break;
            default:
                System.out.println("Error");

        }
    }

}
