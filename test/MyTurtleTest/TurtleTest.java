package MyTurtleTest;

import Chapter7.myTurtle.entities.Direction;
import Chapter7.myTurtle.entities.Pen;
import Chapter7.myTurtle.entities.Position;
import Chapter7.myTurtle.entities.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    Pen pen;
    Turtle turtle;

    @Test
    @BeforeEach
    void setUp(){
        pen = new Pen();
        turtle = new Turtle(pen);

    }
    @Test
    void turtleHasAPen(){
        turtle = new Turtle(pen);
        assertNotNull(turtle);
    }
    @Test
    void turtleCanPenMoveUp(){
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
    }
    @Test
    void turtleCanMovePenDown(){
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    void turtleCanTurnRightFromTheEast(){
        assertSame(Direction.EAST,turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.SOUTH,turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightFromTheSouth(){
        assertSame(Direction.EAST,turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.SOUTH,turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.WEST,turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightFromTheWest(){
        assertSame(Direction.EAST,turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.SOUTH,turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.WEST,turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.NORTH,turtle.getCurrentDirection());

    }
    @Test
    void turtleCanMoveForwardFromTheEast(){
        assertSame(Direction.EAST,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(0,4),turtle.getCurrentPosition());

    }
    @Test
    void turtleCanMoveForwardFromTheSouth(){
        assertSame(Direction.EAST,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(0,4),turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(Direction.SOUTH,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(4,4),turtle.getCurrentPosition());
    }
    @Test
    void turtleCanMoveForwardFacingWest(){
        assertSame(Direction.EAST,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(0,4),turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(Direction.SOUTH,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(4,4),turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(Direction.WEST,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(4,0),turtle.getCurrentPosition());
    }
    @Test
    void turtleCanMoveForwardWhileFacingNorth(){
        assertSame(Direction.EAST,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(0,4),turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(Direction.SOUTH,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(4,4),turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(Direction.WEST,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(4,0),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.moveForwardBy(5);
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
    }
}
