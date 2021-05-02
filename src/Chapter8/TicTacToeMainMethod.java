package Chapter8;


import java.util.Scanner;

public class TicTacToeMainMethod {
    public static void main(String[] args) {
        char[][] board = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };
        printBoard(board);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 - 9 ");
        int userNumber = scanner.nextInt();
        if (userNumber > 9) {System.out.println("Your input is out of bound, enter input between 1-9");}
//        try {
//            if (userNumber > 9)
//                userNumber = scanner.nextInt();
//        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
//            System.out.println("Your input is out of bound, enter input between 1-9");
//        }



        switch (userNumber) {
            case 1:
                board[0][0] = 'X';
                break;
            case 2:
                board[0][2] = 'X';
                break;
            case 3:
                board[0][4] = 'X';
                break;
            case 4:
                board[2][0] = 'X';
                break;
            case 5:
                board[2][2] = 'X';
                break;
            case 6:
                board[2][4] = 'X';
                break;
            case 7:
                board[4][0] = 'X';
                break;
            case 8:
                board[4][2] = 'X';
                break;
            case 9:
                board[4][4] = 'X';
                break;


        }

        printBoard(board);
    }
            public static void printBoard ( char[][] board){
            for (char[] row : board) {
                for (char c : row) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }




        }


