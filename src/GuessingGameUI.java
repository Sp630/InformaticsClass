import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GuessingGameUI {
    public static void main(String[] args) {

        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> genre = new ArrayList<>();



//        JLabel showCLicks = new JLabel("Enter a number from 1 to 100 below: ");
//        JTextField numField = new JTextField();
//        JButton addButton = new JButton("+");
//        JButton removeButton = new JButton("-");
//        JButton enterButton = new JButton("enter");


//        frame.setLayout(new GridLayout(3,1));
//        frame.setSize(300,300);
//        frame.add(showCLicks);
//        frame.add(numField);
//        //frame.add(addButton);
//        //frame.add(removeButton);
//        frame.add(enterButton);

//
//        addButton.addActionListener(new ActionListener(){
//
//            public void actionPerformed(ActionEvent e){
//
//            }
//        });
//
//        removeButton.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
//                int counter = Integer.parseInt(showCLicks.getText());
//                if(counter > 0){
//                    counter--;
//                }
//                showCLicks.setText(String.valueOf(counter));
//            }
//        });
//        enterButton.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                if(Integer.parseInt(numField.getText()) == num){
//                    showCLicks.setText("Correcto!");
//                }
//                else if(Integer.parseInt(numField.getText()) > num){
//                    showCLicks.setText("Incorrecto! Try smaller.");
//                }
//                else if (Integer.parseInt(numField.getText()) < num){
//                    showCLicks.setText("Incorrecto! Try bigger.");
//                }
//            }
//        });
//
    }
}
