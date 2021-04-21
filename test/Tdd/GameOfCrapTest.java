package Tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameOfCrapTest {
    Game game;
    @Test
    void StartEachTestWith(){
        game = new Game();
    }
    @Test
    void GameCanBeCreatedTest(){
        Game game = new Game();
        assertNotNull(game);

    }
//    @Test
//    void RandomNumbersCanBeGeneratedAsDiceIsBeenRolledTwice(){
//       // SecureRandom randomNumbers = new SecureRandom();
////        int roll1 = 1 + randomNumbers.nextInt(6);
////        int roll2 = 1 + randomNumbers.nextInt(6);
//        int roll1 = 0;
//        int roll2 = 0;
//        int sum = roll1
//                + roll2;
//        assertEquals(sum, Game.rollDice(2,3));
    }

