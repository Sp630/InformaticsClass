import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectEndSemester1 {
    public static void main(String[] args) {
        Board board = new Board(3);

        JOptionPane optionPane = new JOptionPane();
        optionPane.setMessage("Hellow");

        //swing integration
        JFrame frame = new JFrame("clicker game");

        JButton one = new JButton("");
        JButton two = new JButton("");
        JButton three = new JButton("");
        JButton one2 = new JButton("");
        JButton two2 = new JButton("");
        JButton three2 = new JButton("");
        JButton one3 = new JButton("");
        JButton two3 = new JButton("");
        JButton three3 = new JButton("");


        frame.setLayout(new GridLayout(3,1));
        frame.setSize(300,300);
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(one2);
        frame.add(two2);
        frame.add(three2);
        frame.add(one3);
        frame.add(two3);
        frame.add(three3);

        frame.setVisible(true);


        //event handling for buttons
        one.addActionListener(new ActionListener(){
            int x = 0;
            int y = 0;
            public void actionPerformed(ActionEvent e){
                board.EndRound();
                if(board.getTurn() == 1){
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].value = 1;
                        one.setText("X");
                        board.setTurn(2);

                    }
                }
                else {
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].value = 2;
                        one.setText("O");
                        board.setTurn(1);
                    }
                }

            }
        });

        two.addActionListener(new ActionListener(){
            int x = 0;
            int y = 1;
            public void actionPerformed(ActionEvent e){
                if(board.getTurn() == 1){
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(1);
                        two.setText("X");
                        board.setTurn(2);
                    }
                }
                else {
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(2);
                        two.setText("O");
                        board.setTurn(1);
                    }
                }
            }
        });

        three.addActionListener(new ActionListener(){
            int x = 0;
            int y = 2;
            public void actionPerformed(ActionEvent e){
                if(board.getTurn() == 1){
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(1);
                        three.setText("X");
                        board.setTurn(2);
                    }
                }
                else {
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(2);
                        three.setText("O");
                        board.setTurn(1);
                    }
                }
            }
        });

        one2.addActionListener(new ActionListener(){
            int x = 1;
            int y = 0;
            public void actionPerformed(ActionEvent e){
                if(board.getTurn() == 1){
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(1);
                        one2.setText("X");
                        board.setTurn(2);
                    }
                }
                else {
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(2);
                        one2.setText("O");
                        board.setTurn(1);
                    }
                }
            }
        });

        two2.addActionListener(new ActionListener(){
            int x = 1;
            int y = 1;
            public void actionPerformed(ActionEvent e){
                if(board.getTurn() == 1){
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(1);
                        two2.setText("X");
                        board.setTurn(2);
                    }
                }
                else {
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(2);
                        two2.setText("O");
                        board.setTurn(1);
                    }
                }
            }
        });

        three2.addActionListener(new ActionListener(){
            int x = 1;
            int y = 2;
            public void actionPerformed(ActionEvent e){
                if(board.getTurn() == 1){
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(1);
                        three2.setText("X");
                        board.setTurn(2);
                    }
                }
                else {
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(2);
                        three2.setText("O");
                        board.setTurn(1);
                    }
                }
            }
        });

        one3.addActionListener(new ActionListener(){
            int x = 2;
            int y = 0;
            public void actionPerformed(ActionEvent e){
                if(board.getTurn() == 1){
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(1);
                        one3.setText("X");
                        board.setTurn(2);
                    }
                }
                else {
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(2);
                        one3.setText("O");
                        board.setTurn(1);
                    }
                }
            }
        });
        two3.addActionListener(new ActionListener(){
            int x = 2;
            int y = 1;
            public void actionPerformed(ActionEvent e){
                if(board.getTurn() == 1){
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(1);
                        two3.setText("X");
                        board.setTurn(2);
                    }
                }
                else {
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(2);
                        two3.setText("O");
                        board.setTurn(1);
                    }
                }
            }
        });

        three3.addActionListener(new ActionListener(){
            int x = 2;
            int y = 2;
            public void actionPerformed(ActionEvent e){
                if(board.getTurn() == 1){
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(1);
                        three3.setText("X");
                        board.setTurn(2);
                    }
                }
                else {
                    if(board.tiles[x][y].GetValue() == 0){
                        board.tiles[x][y].SetValue(2);
                        three3.setText("O");
                        board.setTurn(1);
                    }
                }
            }
        });



        }
    }
//board class, manages the game, holds all information about the game
class Board{
    int size;
    int turn = 1;
    public Board(int size){
        this.size = size;
        FillBoard();
    }


    public Board(){
        this.size = 3;
        FillBoard();
    }
    public int getTurn(){
        return turn;
    }
    public void setTurn(int n){
        turn = n;
        EndRound();
    }
    public void endGame(String player){
        JOptionPane optionPane = new JOptionPane();
        //Shows a message informing the players of who has won
        optionPane.showMessageDialog(null, "Player " + player + " has won!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        //Closes the program because we are civilized
        System.exit(0);
    }

    Tile[][] tiles = new Tile[3][3];
    void FillBoard(){
        for(int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                tiles[i][j] = new Tile(0);
            }
        }
    }



    //checks if someone won
    void EndRound(){

        if(tiles[0][0].GetValue() == 1){
            if(tiles[0][1].GetValue() == 1){
                if(tiles[0][2].GetValue() == 1){
                    System.out.println("Player One Won");
                    endGame("1");
                }
            }
            if(tiles[1][0].GetValue() == 1){
                if(tiles[2][0].GetValue() == 1){
                    System.out.println("Player One Won");
                    endGame("1");

                }
            }
            if(tiles[1][1].GetValue() == 1){
                if(tiles[2][2].GetValue() == 1){
                    System.out.println("Player One Won");
                    endGame("1");

                }
            }

        }
        if(tiles[0][2].GetValue() == 1){
            if(tiles[1][2].GetValue() == 1){
                if(tiles[2][2].GetValue() == 1){
                    System.out.println("Player One Won");
                    endGame("1");

                }
            }
        }
        if(tiles[2][0].GetValue() == 1){
            if(tiles[2][1].GetValue() == 1){
                if(tiles[2][2].GetValue() == 1){
                    System.out.println("Player One Won");
                    endGame("1");

                }
            }
            if(tiles[1][1].GetValue() == 1){
                if(tiles[0][2].GetValue() == 1){
                    System.out.println("Player One Won");
                    endGame("1");

                }
            }
        }
        if(tiles[0][1].GetValue() == 1){
            if(tiles[1][1].GetValue() == 1){
                if(tiles[2][1].GetValue() == 1){
                    System.out.println("Player One Won");
                    endGame("1");

                }
            }
        }
        if(tiles[1][0].GetValue() == 1){
            if(tiles[1][1].GetValue() == 1){
                if(tiles[1][2].GetValue() == 1){
                    System.out.println("Player One Won");
                    endGame("1");

                }
            }
        }

        //Player 2:
        if(tiles[0][0].GetValue() == 2){
            if(tiles[0][1].GetValue() == 2){
                if(tiles[0][2].GetValue() == 2){
                    System.out.println("Player Two Won");
                    endGame("2");
                }
            }
            if(tiles[1][0].GetValue() == 2){
                if(tiles[2][0].GetValue() == 2){
                    System.out.println("Player Two Won");
                    endGame("2");

                }
            }
            if(tiles[1][1].GetValue() == 2){
                if(tiles[2][2].GetValue() == 2){
                    System.out.println("Player Two Won");
                    endGame("2");
                }
            }

        }
        if(tiles[0][2].GetValue() == 2){
            if(tiles[1][2].GetValue() == 2){
                if(tiles[2][2].GetValue() == 2){
                    System.out.println("Player Two Won");
                    endGame("2");
                }
            }
        }
        if(tiles[2][0].GetValue() == 2){
            if(tiles[2][1].GetValue() == 2){
                if(tiles[2][2].GetValue() == 2){
                    System.out.println("Player Two Won");
                    endGame("2");
                }
            }
            if(tiles[1][1].GetValue() == 2){
                if(tiles[0][2].GetValue() == 2){
                    System.out.println("Player Two Won");
                    endGame("2");
                }
            }
        }
        if(tiles[0][1].GetValue() == 2){
            if(tiles[1][1].GetValue() == 2){
                if(tiles[2][1].GetValue() == 2){
                    System.out.println("Player Two Won");
                    endGame("2");

                }
            }
        }
        if(tiles[1][0].GetValue() == 2){
            if(tiles[1][1].GetValue() == 2){
                if(tiles[1][2].GetValue() == 2){
                    System.out.println("Player Two Won");
                    endGame("2");
                }
            }
        }

    }

}

//tile class, manages the tile
class Tile{
    int value;
    public Tile(int value){
        this.value = value;
    }
    public Tile(){
        value = 0;
    }
    int GetValue(){
        return value;
    }
    void SetValue(int newValue){
        this.value = newValue;

    }
}

