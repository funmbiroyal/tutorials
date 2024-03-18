//package Chapter8Test;
//
//import Chapter8.Player;
//import Chapter8.Board;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static Chapter8.BoardState.EMPTY;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class TicTacToeTest {
//    Board board;
//    Board ticTacToe;
//    @Test
//    @BeforeEach
//    void startEachTestWithThis(){
//        ticTacToe = new Board();
//    }
//    @Test
//    void ticTacToeCanBeCreated(){
//        Board ticTacToe = new Board();
//        assertNotNull(ticTacToe);
//    }
//
//    @Test
//    void ticTacToeCanBoardBeCreated(){
//       Board board = new Board();
//       assertNotNull(board);
//
//    }
////    @Test
////    void canPrintBoardGame(){
////        ticTacToe.printBoard();
////    }
//@Test
//    void ticTacToeBoardHasRows(){
//
//        assertEquals(3,ticTacToe.getRows());
//    }
//@Test
//    void ticTacTacBoardHasColumns(){
//
//        assertEquals(3,ticTacToe.getColumns());
//}
////@Test
////    void ticTacToeBoardIsEmpty(){
////        assertEquals(EMPTY,ticTacToe.getBoardState());
////}
//
//    @Test
//    void ticTacToeHasTwoPlayers(){
//        Player playerX = new Player(boardFull, lastValuePlayedWasX);
//        Player playerO = new Player(boardFull, lastValuePlayedWasX);
//        assertNotNull(playerX);
//        assertNotNull(playerO);
//        assertEquals(2,ticTacToe.getTotalNumberOfPlayers());
//    }
//    @Test
//    void playersCanEnterInput(){
//        ticTacToe.enterInput(4);
//        assertEquals(4,ticTacToe.getInput());
//    }
//  @Test
//  void playersCannotEnterNegativeValues(){
//        ticTacToe.enterInput(-1);
//        assertEquals(0,ticTacToe.getInput());
//  }
//  @Test
//    void canPrintGameBoard(){
//        assertEquals(EMPTY,ticTacToe.printGameBoard());
//    }
//@Test
//    void canCheckWinner(){
//        assertEquals("winner",ticTacToe.checkWinner()
//        );
//
//}
//}
//
