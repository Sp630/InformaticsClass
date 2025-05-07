import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Class07_05_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> producs = new ArrayList<>();
        String line = "";
        while (!line.equalsIgnoreCase("done")){
            System.out.println("Enter product name: ");
            line = scanner.nextLine();
            producs.add(line);
        }

        System.out.println("Enter file name: ");
        String filename = scanner.nextLine();

        try(FileWriter outStream = new FileWriter(filename, true)){ // Create stream & open file
            for(String product : producs){
                outStream.write(product + "\n");
            }
            System.out.println("fileWriterTest method is successful!");
        }
        catch (IOException e){
            System.out.println("oppa: " + e);
        }
    }
}
