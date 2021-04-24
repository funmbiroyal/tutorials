package Chapter8;

public class TicTacToe {

    public BoardState board[][]  = new BoardState[3][3];
    private int totalNumberOfPlayers = 2;

    public TicTacToe( ){
        for (int row = 0; row < board.length ; row++) {
            for (int column = 0; column < board[row].length ; column++) {
                board[row][column] = BoardState.EMPTY;
            }

            }
        }


//    public BoardState getBoardState() {
//
//        return BoardState.O;
//    }
//    public BoardState [][] getTicTacToeBoard(){
//        return Board;
//    }

    public int getRows() {
        int rowCount = 0;
        for (int row = 0; row < board.length ; row++) {
            rowCount++;
        }
        return rowCount;
    }

    public int getColumns() {
        int columnCount = 0;
        for (int column = 0; column < board[0].length; column++) {
            columnCount++;
        }
        return columnCount;
    }

    public BoardState getBoardState() {
        return BoardState.EMPTY;
    }

    public int getTotalNumberOfPlayers() {
        return this.totalNumberOfPlayers;
    }
}
