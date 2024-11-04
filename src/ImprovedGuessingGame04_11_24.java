import java.util.Scanner;
import java.util.Random;
public class ImprovedGuessingGame04_11_24 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = 1 + rand.nextInt(100);
        System.out.println("Good day to you, dear user! Guess a number and I will tell you if you guessed it direcktly.");
        Guess guess = new Guess(num);
    }
}

class Guess {
    int num;
    public Guess(int num) {
        this.num = num;
        Scanner scanner = new Scanner(System.in);
        int input = 101;
        int count = 1;
        System.out.println("Please enter a number between 1 and 100");
        while(input != num){
            if(scanner.hasNextInt()){
                input = scanner.nextInt();
                if(input == num){
                    System.out.println("You guessed it in " + count + " attempts. Have a nice day!");
                }
                else if(input > num){
                    System.out.println("Too big, try again.");
                }
                else if(input < num){
                    System.out.println("Too small, try again.");
                }
            }else if(scanner.next().equals("quit")){
                System.out.println("The number was: " + num + ". Have a lovely day!");
                System.exit(0);
            }
            else {
                System.out.println("Invalid input! Try again.");

            }


            count++;
        }
    }
}
