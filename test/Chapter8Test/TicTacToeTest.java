package Chapter8Test;

import Chapter8.Board;
import Chapter8.Players;
import Chapter8.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Chapter8.BoardState.EMPTY;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TicTacToeTest {
    Board board;
    TicTacToe ticTacToe;
    @Test
    @BeforeEach
    void startEachTestWithThis(){
        ticTacToe = new TicTacToe();
    }
    @Test
    void ticTacToeCanBeCreated(){
        TicTacToe ticTacToe = new TicTacToe();
        assertNotNull(ticTacToe);
    }

    @Test
    void ticTacToeCanBoardBeCreated(){
       Board board = new Board();
       assertNotNull(board);

    }
@Test
    void ticTacToeBoardHasRows(){
        assertEquals(3,ticTacToe.getRows());
    }
@Test
    void ticTacTacBoardHasColumns(){
        assertEquals(3,ticTacToe.getColumns());
}
@Test
    void ticTacToeBoardIsEmpty(){
        assertEquals(EMPTY,ticTacToe.getBoardState());
}

    @Test
    void ticTacToeHasTwoPlayers(){
        Players playerX = new Players();
        Players playerO = new Players();
        assertNotNull(playerX);
        assertNotNull(playerO);
        assertEquals(2,ticTacToe.getTotalNumberOfPlayers());
    }
}

