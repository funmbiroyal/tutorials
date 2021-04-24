package Chapter8Test;

import Chapter8.Players;
import Chapter8.TicTacToe;
import org.junit.jupiter.api.Test;

import static Chapter8.BoardState.X;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerTest {



    @Test
    void playerXcanMove(){
        TicTacToe ticTacToe =new TicTacToe();
        Players playerX = new Players();
        playerX.playerXMove(0,0);
        assertEquals(X,ticTacToe.board[0][0]);
    }
}
