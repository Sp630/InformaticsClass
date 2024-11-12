import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class12_11_24 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("clicker game");
        JLabel showCLicks = new JLabel("0");
        JButton addButton = new JButton("+");
        JButton removeButton = new JButton("-");
        JButton resetButton = new JButton("reset");


        frame.setLayout(new GridLayout(3,1));
        frame.setSize(300,300);
        frame.add(showCLicks);
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(resetButton);

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
        resetButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                showCLicks.setText("0");
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