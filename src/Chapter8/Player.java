package Chapter8;

import java.util.HashSet;
import java.util.Set;

public class Players {
    private Board playerBoard;
    private int movesMade = 0;
    private boolean playerWon;
    private boolean boardFull;
    private boolean lastValuePlayedWasX;

    public Players() {
        this.playerBoard = new Board();
        this.boardFull = false;
        this.playerWon = false;
        this.lastValuePlayedWasX = false;
    }

    public void play(int gridPosition) throws BoardFullException, AlreadyOccupiedException, GameOverException {
        if (boardFull) {
            throw new BoardFullException();
        }
        int position = gridPosition - 1;
        int row = position / 3;
        int column = position % 3;
        BoardState[][] array = playerBoard.getBoardArray();
        if (array[row][column] != BoardState.EMPTY) {
            throw new AlreadyOccupiedException();
        }
        if (lastValuePlayedWasX) {
            array[row][column] = BoardState.O;
            lastValuePlayedWasX = false;
        } else {
            array[row][column] = BoardState.X;
            lastValuePlayedWasX = true;
        }
        if (playerWon) {
            throw new GameOverException();
        }
        if (movesMade < 9) {
            movesMade++;
        }
        if (movesMade == 9) {
            boardFull = true;
        }
    }

    public boolean isPlayerWon() {
        BoardState [][] array = playerBoard.getBoardArray();
        for (int row = 0; row < array.length ; row++) {
            Set<BoardState> values = new HashSet<>();
            for (int column = 0; column < array.length; column++) {
                values.add(array[row][column]);
            }
            if (!values.contains(BoardState.EMPTY) && values.size() == 1){
                return true;
            }
        }
        Set<BoardState> leftDiagonalValues = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            int row = i;
            int column = i;
            leftDiagonalValues.add(array[row][column]);
        }
        if (!leftDiagonalValues.contains(BoardState.EMPTY) && leftDiagonalValues.size() == 1){
            return true;
        }
      Set<BoardState> rightDiagonalValues = new HashSet<>();
        for (int row = 0; row < array.length ; row++) {
            for (int column = array.length; column > 0; column--) {
                rightDiagonalValues.add(array[row][column]);
            }
            if (!rightDiagonalValues.contains(BoardState.EMPTY) && rightDiagonalValues.size() == 1){
                return  true;
            }
        }

        return false;
    }
    public void display(){
        playerBoard.displayBoard();
    }

}

