import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int pos = 0;
        String input = "0";

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("POS: " + pos);
            System.out.println("Input: " + input);
            for(int i = 0; i < 25; i++){
                if(i % 5 == 0){
                    System.out.println();
                }
                if(i == pos){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
                System.out.print(" ");
            }
            System.out.println("\n");

            input = scanner.nextLine();

            if(input.equals("w")){
                if(pos - 5 >= 0){
                    pos -= 5;
                }
            }
            if(input.equals("s")){
                if(pos + 5 <= 25){
                    pos += 5;
                }
            }
            if(input.equals("a")){
                if(pos - 1 >= 0){
                    pos -= 1;
                }
            }
            if(input.equals("d")){
                if(pos + 1 <= 25){
                    pos += 1;
                }
            }
        }


    }
}
