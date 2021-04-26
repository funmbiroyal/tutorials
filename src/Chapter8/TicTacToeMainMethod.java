package Chapter8;

import java.util.Scanner;

public class TicTacToeMainMethod {
    public static void main(String[] args) {
        char [][] board = {{' ' ,'|', ' ' ,'|' ,' '},
                {'-' ,'+', '-' ,'+' ,'-'},
                {' ' ,'|', ' ' ,'|' ,' '},
                {'-' ,'+', '-' ,'+' ,'-'},
                {' ' ,'|', ' ' ,'|' ,' '}};

        for(char[] row: board){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
