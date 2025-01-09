import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ProductProject {
    public static void main(String[] args) {

        //GUI
        JFrame frame = new JFrame("Manager");
        //JLabel showCLicks = new JLabel("Enter a number from 1 to 100 below: ");
        JTextField nameField = new JTextField("Name");
        nameField.setPreferredSize(new Dimension(60, 30));
        JTextField priceField = new JTextField("Price");
        priceField.setPreferredSize(new Dimension(60, 30));
        JTextField quantityField = new JTextField("Quantity");
        quantityField.setPreferredSize(new Dimension(60, 30));
        JButton addButton = new JButton("Add");
        JButton updateButton = new JButton("Update");
        JButton displayButton = new JButton("Display Inventory");
        //JTextField output = new JTextField();
        //output.setPreferredSize(new Dimension(300, 120));
        JTextArea output = new JTextArea();
        output.setPreferredSize(new Dimension(300, 120));
        output.setEditable(false);
        output.setLineWrap(true);


        frame.setLayout(new FlowLayout());
        frame.setSize(300,300);
        frame.add(nameField);
        frame.add(priceField);
        frame.add(quantityField);
        frame.add(addButton);
        frame.add(updateButton);
        frame.add(displayButton);
        frame.add(output);

        frame.setVisible(true);
        Inventory inventory = new Inventory();


        //Button functions
        addButton.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                inventory.addProduct(nameField.getText(), Double.parseDouble(priceField.getText()), Integer.parseInt(quantityField.getText()));
            }
        });
        displayButton.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                inventory.displayProducts(output);
            }
        });

        updateButton.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                inventory.updateProduct(nameField.getText(), Double.parseDouble(priceField.getText()), Integer.parseInt(quantityField.getText()));
            }
        });


    }
}

//Product class
class Product{
    String name;
    double price;
    int quantity;
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String Display(){
        return "Name: " + name + " Price: " + price + " Quantity: " + quantity;

    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String update){
        name = update;
    }
    public void setPrice(double update){
        price = update;
    }
    public void setQuantity(int update){
        quantity = update;
    }
}

//Inventory class
class Inventory{
    ArrayList<Product> products = new ArrayList<>();
    public void Inventory(){

    }
    public void Inventory(ArrayList<Product> list){
        products = list;
    }
    public void addProduct(String pName, double pPrice, int pQuantity){
        if(pPrice >= 0 && pQuantity >= 0){
            products.add(new Product(pName, pPrice, pQuantity));
        }

    }
    public void updateProduct(String pName, double pPrice, int pQuantity){
        for(int i = 0; i<products.size(); i++){
            if(pPrice >= 0 && pQuantity >= 0){
                if(products.get(i).getName().equals(pName)){
                    products.get(i).setPrice(pPrice);
                    products.get(i).setQuantity(pQuantity);
                }
            }

        }
    }
    public void displayProducts(JTextArea output){
        String combine = "";
        for(int i = 0; i<products.size(); i++){
            products.get(i).Display();
            combine = combine + "\n" + products.get(i).Display();
        }
        System.out.println(combine);
        output.setText(combine);
    }

}