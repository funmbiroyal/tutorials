package Chapter8;

public class Players {
    TicTacToe ticTacToe = new TicTacToe();
    int move1 = 00;
    public void playerXMove(int row, int column) {
        if (ticTacToe.board[row][column] == BoardState.EMPTY) {
            ticTacToe.board[row][column] = BoardState.X;
        }
        //if(move1==1) System.out.println("your position is" + " "+move1);
    }
}
