import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class PBLSemester2 {
    static String[][] tableData;
    static String selectedGenre = "None";
    static int sorted = 0;
    static int numOfMovies = 5;
    public static void main(String[] args) {
        //Set<String> titles = new HashSet<>();
        //Set<String> genre = new HashSet<>();
        ArrayList<Movie> movies = new ArrayList<Movie>();

        Movie m1 = new Movie("Transformers 1", "Action");
        Movie m2 = new Movie("A Spas", "Comedy");
        Movie m3 = new Movie("Spas against the world", "Comedy");
        Movie m4 = new Movie("Spas 2, a story beyond time", "Romantic");
        Movie m5 = new Movie("Spas and friends", "Sitcom");

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);
        movies.add((m5));


        tableData = convertToArray(movies);
        String[] tableNames = {"titles", "genre"};
        JFrame frame = new JFrame("clicker game");
        JButton addButton = new JButton("add");
        JButton sortButton = new JButton("sort toggle");
        JButton searchButton = new JButton("search");
        JTextField textField = new JTextField(10);
        JTextField textField1 = new JTextField(10);
        textField1.setText("Number of Movies: 5");
        textField.setMaximumSize(new Dimension(1200, 25));
        textField1.setMaximumSize(new Dimension(1200, 25));
        //JTextField textField1 = new JTextField(10);
        //textField1.setMaximumSize(new Dimension(1200, 25));
        String[] options = {"None", "Action", "Comedy", "Sitcom", "Romantic"};
        JComboBox comboBox = new JComboBox(options);
        comboBox.setMaximumSize(new Dimension(1200, 25));
        DefaultTableModel model = new DefaultTableModel(tableData, tableNames);
        JTable table = new JTable(model);

        BoxLayout box = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
        frame.setLayout(box);
        frame.setSize(300,300);
        frame.add(textField1);
        frame.add(textField);
        frame.add(comboBox);
        frame.add(addButton);
        frame.add(sortButton);
        frame.add(searchButton);
        frame.add(table);
        frame.setVisible(true);




        searchButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int num = 0;
                String text = textField.getText();
                for(int i = 0; i < movies.size(); i++){
                    if(movies.get(i).title.equalsIgnoreCase(text)){
                        num = i;
                        JTableRowColorChanger.changeRowColor(table, 1, Color.YELLOW);
                        System.out.println("Changing Color");

                    }
                }

            }
        });

        addButton.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                if(!selectedGenre.equalsIgnoreCase("None")){
                    AddMovie(textField.getText(), selectedGenre, movies, tableData, textField1);
                    model.setDataVector(tableData, tableNames);
                    model.fireTableDataChanged();
                }

            }
       });
        comboBox.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String selection = (String) comboBox.getSelectedItem();
                if(!selection.equals("None")){
                    selectedGenre = (String)comboBox.getSelectedItem();
                }
            }
        });

        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(sorted);
                ArrayList<Movie> sortedMovies = new ArrayList<>();
                if(sorted == 0){
                    Set<String> titles = new HashSet<>();
                    for(Movie mov : movies){
                        titles.add(mov.title);
                    }
                    ArrayList<String> sortedTitles = new ArrayList<>(titles);
                    Collections.sort(sortedTitles);
                    for (String title : sortedTitles){
                        for(Movie mov : movies){
                            if(title.equalsIgnoreCase(mov.title)){
                                sortedMovies.add(mov);
                            }

                        }
                    }

                    tableData = convertToArray(sortedMovies);
                    model.setDataVector(tableData, tableNames);
                    model.fireTableDataChanged();
                    sortingHelper(1);
                }else {
                    String genre = (String) comboBox.getSelectedItem();
                    ArrayList<Movie> sortedMoviesByTitle = new ArrayList<>();
                    for(Movie mov : movies){

                        System.out.println("Genre: " + genre + " Movie Genre: " + mov.genre);
                        if(genre.equalsIgnoreCase(mov.genre) && !genre.equalsIgnoreCase("None")){
                            System.out.println("Ture");
                            sortedMoviesByTitle.add(mov);
                        }
                    }
                    for(Movie mov : sortedMoviesByTitle){
                        System.out.println(mov.title);
                    }
                    if(!genre.equalsIgnoreCase("None")){
                        tableData = convertToArray(sortedMoviesByTitle);
                        model.setDataVector(tableData, tableNames);
                        model.fireTableDataChanged();
                        sortingHelper(0);
                    }

                }


            }
        });
    }

    public static void AssignGenre(String newGenre){
        selectedGenre = newGenre;
    }
    public static void sortingHelper(int num){
        sorted = num;
    }
    public static String[][] convertToArray(ArrayList<Movie> movies){

        String[][] result = new String[movies.size()][movies.size() + 1];
        System.out.println(result[0][0]);
        int count = 0;
        for(Movie mov : movies){
            result[count][0] = mov.title;
            count++;

        }
        count = 0;
        for(Movie mov : movies){
            result[count][1] = mov.genre;
            count++;


        }
        return result;
    }
     static void AddMovie(String title, String genre, ArrayList<Movie> movies, String[][] table, JTextField textField){
        boolean check = true;
        for(Movie mov : movies){
            if(mov.title.equalsIgnoreCase(title)){
                check = false;
            }
        }
        if(check){
            movies.add(new Movie(title, genre));
            tableData = convertToArray(movies);
            numOfMovies++;
            textField.setText("Number of Movies: " + String.valueOf(numOfMovies));
        }

    }


}
class Movie{
    String title;
    String genre;
    public Movie(String title, String genre){
        this.title = title;
        this.genre = genre;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }

}
class JTableRowColorChanger {

    public static void changeRowColor(JTable table, int rowIndex, Color color) {
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (row == rowIndex) {
                    c.setBackground(color);
                } else {
                    c.setBackground(table.getBackground());
                }

                return c;
            }
        });


        table.repaint();
    }
}
