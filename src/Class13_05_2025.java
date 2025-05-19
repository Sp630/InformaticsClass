import java.io.*;

public class Class13_05_2025 {
    public static void main(String[] args) {
        writeEmp("path1");
        readEmp("path1");
        

    }
    public static void writeEmp(String path){
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(path))) {
            for (int i = 0; i < 5; i++) {
                dataOutputStream.writeUTF("Student: " + (i + 1));
                double grade = Math.random() * 100;
                dataOutputStream.writeDouble(grade);
                dataOutputStream.writeInt((int)((grade/100)*4));
                dataOutputStream.writeInt((int)(Math.random() * 100));
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void readEmp(String path){
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream(path))) {
            try {
                while (true) {
                    System.out.println(dataInputStream.readUTF());
                    System.out.println("Percentage: " + dataInputStream.readDouble());
                    System.out.println("GPA: " + dataInputStream.readInt());
                    System.out.println("Age: " + dataInputStream.readInt());
                }
            } catch (EOFException e) {
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
