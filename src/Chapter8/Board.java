package Chapter8;

public class Board {

    public BoardState boardArray[][]  = new BoardState[3][3];
    private int totalNumberOfPlayers = 2;

    public Board( ){
        for (int row = 0; row < boardArray.length ; row++) {
            for (int column = 0; column < boardArray[row].length ; column++) {
                boardArray[row][column] = BoardState.EMPTY;
            }

            }
        }


public BoardState[][] getBoardArray(){
        return boardArray;
}
public void displayBoard(){
    for (int row = 0; row < boardArray.length ; row++) {
        for (int column = 0; column < boardArray[row].length; column++){
            System.out.println(boardArray[row][column]);
        }
        System.out.println();
    }
}

    public int getRows() {
        int rowCount = 0;
        for (int row = 0; row < boardArray.length ; row++) {
            rowCount++;
        }
        return rowCount;
    }

    public int getColumns() {
        int columnCount = 0;
        for (int column = 0; column < boardArray[0].length; column++) {
            columnCount++;
        }
        return columnCount;
    }

//    public BoardState getBoardState() {
//        return BoardState.EMPTY;
//    }

    public int getTotalNumberOfPlayers() {
        return this.totalNumberOfPlayers;
    }





    public BoardState printGameBoard() {
        return BoardState.EMPTY;
    }

    public String checkWinner() {
        return "winner";
    }
}

