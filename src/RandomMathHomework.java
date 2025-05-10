import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class RandomMathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();
        int num = 0;
        Random rand = new Random();
        while(num < 5){
            num++;
            int a = rand.nextInt(100);
            int b = rand.nextInt(100);
            System.out.println(a + "+" + b + "=?");
            int answer = a + b;
            int studentAnswer = scanner.nextInt();
            try(FileWriter outStream = new FileWriter(name + " - answers", true)){ // Create stream & open file
                outStream.write(a + "+" + b + "=" + answer + " Your answer: " + studentAnswer + "\n");

            }
            catch (IOException e){
                System.out.println("oppa: " + e);
            }
        }



    }
}
