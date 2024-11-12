import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;
public class Class06_11_24 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Megalator 5000");
        frame.setLayout(null);
        frame.setSize(1000, 1000);
        frame.setVisible(true);

        JTextField textField = new JTextField();
        textField.setSize(100, 100);
        textField.setLocation(30, 10);
        textField.setBackground(Color.blue);
        frame.add(textField);

        JTextField textField1 = new JTextField();
        textField1.setSize(100, 100);
        textField1.setLocation(350, 10);
        textField1.setBackground(Color.red);
        frame.add(textField1);

        JButton button = new JButton("+");
        button.setSize(100, 100);
        button.setLocation(30, 10);
        button.setBounds(190, 30, 100, 30);
        button.setBackground(Color.green);
        frame.add(button);

        JButton button1 = new JButton("-");
        button1.setSize(100, 100);
        button1.setLocation(30, 10);
        button1.setBounds(190, 60, 100, 30);
        button1.setBackground(Color.green);
        frame.add(button1);

        JButton button3 = new JButton("x");
        button3.setSize(100, 100);
        button3.setLocation(30, 10);
        button3.setBounds(190, 90, 100, 30);
        button3.setBackground(Color.green);
        frame.add(button3);

        JButton button4 = new JButton("/");
        button4.setSize(100, 100);
        button4.setLocation(30, 10);
        button4.setBounds(190, 120, 100, 30);
        button4.setBackground(Color.green);
        frame.add(button4);

        JButton button5 = new JButton("Reset");
        button5.setSize(100, 100);
        button5.setLocation(30, 10);
        button5.setBounds(190, 150, 100, 30);
        button5.setBackground(Color.green);
        frame.add(button5);

        Random random = new Random();

        JLabel label = new JLabel();
        label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        label.setText("Roses are blue, violets are red, your result is: " + random.nextInt(101));
        label.setSize(1000, 100);
        label.setLocation(70, 200);
        label.setBackground(Color.green);
        frame.add(label);

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input == 0){

        }
    }

}
