import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessingGameUI {
    public static void main(String[] args) {

        Random rand = new Random();
        int num = 1 + rand.nextInt(100);
        //int num = 10;


        JFrame frame = new JFrame("clicker game");
        JLabel showCLicks = new JLabel("Enter a number from 1 to 100 below: ");
        JTextField numField = new JTextField();
        JButton addButton = new JButton("+");
        JButton removeButton = new JButton("-");
        JButton enterButton = new JButton("enter");


        frame.setLayout(new GridLayout(3,1));
        frame.setSize(300,300);
        frame.add(showCLicks);
        frame.add(numField);
        //frame.add(addButton);
        //frame.add(removeButton);
        frame.add(enterButton);

        frame.setVisible(true);

        addButton.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                int counter = Integer.parseInt(showCLicks.getText());
                counter++;
                showCLicks.setText(String.valueOf(counter));
            }
        });

        removeButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int counter = Integer.parseInt(showCLicks.getText());
                if(counter > 0){
                    counter--;
                }
                showCLicks.setText(String.valueOf(counter));
            }
        });
        enterButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(Integer.parseInt(numField.getText()) == num){
                    showCLicks.setText("Correcto!");
                }
                else if(Integer.parseInt(numField.getText()) > num){
                    showCLicks.setText("Incorrecto! Try smaller.");
                }
                else if (Integer.parseInt(numField.getText()) < num){
                    showCLicks.setText("Incorrecto! Try bigger.");
                }
            }
        });


/* TASK: Improve this game by adding another button to reset and to decrement the counter.
Your GUI should look like this:

------------
0
|+| |-| |reset|
------------

*/
    }
}
