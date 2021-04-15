package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;


public class TurtleTest {
    Pen pen;
    Pen secondPen;
    Turtle turtle;
    @BeforeEach
    void startAllTestWithThis(){
         pen = new Pen();
        secondPen = new Pen();
        turtle = new Turtle (pen);
    }
    @Test
    void turtleHasAPenTest(){
        assertNotNull(turtle.getPen());
        assertEquals(pen,turtle.getPen());
        assertNotEquals(secondPen,turtle.getPen());
    }

    @Test
    void turtleCanMovePenUp(){
        //when
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());

    }
    @Test
    void turtleCanMovePenDown(){
        assertTrue(turtle.isPenUp());
        //when
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    void turtleCanTurnRightWhileFacingEast() {
        //given
        assertSame(EAST, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        //assert
        assertSame(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingSouth(){
        //given
        turtle.turnRight();
        //assert
        assertSame(SOUTH, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        //assert
        assertSame(WEST,turtle.getCurrentDirection());

    }
    @Test
    void turtleCanTurnRightWhileFacingWest(){
        //given
        turtle.turnRight();
        //assert
        assertSame(SOUTH, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        //assert
        assertSame(WEST,turtle.getCurrentDirection());
      turtle.turnRight();
       assertSame(NORTH,turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingNorth(){
        //given
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH,turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(EAST,turtle.getCurrentDirection());
    }
    @Test
    void turtleCanMoveForwardFacingEast(){
        assertSame(EAST,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(0,5), turtle.getCurrentPosition());
    }

}
