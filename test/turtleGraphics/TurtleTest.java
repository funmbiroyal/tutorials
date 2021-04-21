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
        assertEquals(new Position(0,4), turtle.getCurrentPosition());
    }
@Test
    void turtleCanMoveForwardFacingSouth(){
    assertSame(EAST,turtle.getCurrentDirection());
    turtle.moveForwardBy(5);
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
      assertEquals(new Position(4,4),turtle.getCurrentPosition());
}
    @Test
    void turtleCanMoveForwardFacingWest(){
        assertSame(EAST,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(4,4),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.moveForwardBy(5);
        assertEquals(new Position(4,0),turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardFacingNorth(){
        assertSame(EAST,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(4,4),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.moveForwardBy(5);
        assertEquals(new Position(4,0),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.moveForwardBy(5);
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
    }
@Test
    void turtleCanWriteWhileFacingEast(){
        //given
        turtle.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        //when
         int numberOfSteps= 5;
         turtle.writeOn(sketchPad,5);
    //assert
          int counter = 0;
          int [][] floor = sketchPad.getFloor();
          while (counter < numberOfSteps){
              assertEquals(1,floor[0][counter]);
        counter++;
    }
assertEquals(new Position(0,4),turtle.getCurrentPosition());

    }
    @Test
    void turtleCanWriteWhileFacingSouth(){
        //given
        turtle.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps =  5;
        turtle.writeOn(sketchPad,5);
        //assert
        int counter = 0;
        int [][] floor = sketchPad.getFloor();
        while (counter<numberOfSteps){
            assertEquals(1,floor[0][counter]);
            counter++;
        }
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
        turtle.writeOn(sketchPad,5);
        floor = sketchPad.getFloor();
        counter = 0;
        while(counter<numberOfSteps){
            assertEquals(1, floor[counter][4]);
            counter++;
        }
        assertEquals(new Position(4,4),turtle.getCurrentPosition());
    }
    @Test
    void turtleCanWriteWhileFacingWest(){
        //given
        turtle.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps =  5;
        turtle.writeOn(sketchPad,5);
        //assert
        int counter = 0;
        int [][] floor = sketchPad.getFloor();
        while (counter<numberOfSteps){
            assertEquals(1,floor[0][counter]);
            counter++;
        }
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
        turtle.writeOn(sketchPad,5);
        floor = sketchPad.getFloor();
        counter = 0;
        while(counter<numberOfSteps){
            assertEquals(1, floor[counter][4]);
            counter++;
        }
        assertEquals(new Position(4,4),turtle.getCurrentPosition());

        turtle.turnRight();
        assertSame(WEST,turtle.getCurrentDirection());

        turtle.writeOn(sketchPad,5);
        floor = sketchPad.getFloor();
        counter = 0;
        while(counter<numberOfSteps){
            assertEquals(1,floor[4][counter]);
            counter++;
        }
        assertEquals(new Position(4,0),turtle.getCurrentPosition());
    }
    @Test
    void turtleCanWriteWhileFacingNorth(){
        turtle.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps =  5;
        turtle.writeOn(sketchPad,5);
        //assert
        int counter = 0;
        int [][] floor = sketchPad.getFloor();
        while (counter<numberOfSteps){
            assertEquals(1,floor[0][counter]);
            counter++;
        }
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
        turtle.writeOn(sketchPad,5);
        floor = sketchPad.getFloor();
        counter = 0;
        while(counter<numberOfSteps){
            assertEquals(1, floor[counter][4]);
            counter++;
        }
        assertEquals(new Position(4,4),turtle.getCurrentPosition());

        turtle.turnRight();
        assertSame(WEST,turtle.getCurrentDirection());

        turtle.writeOn(sketchPad,5);
        floor = sketchPad.getFloor();
        counter = 0;
        while(counter<numberOfSteps){
            assertEquals(1,floor[4][counter]);
            counter++;
        }
        assertEquals(new Position(4,0),turtle.getCurrentPosition());

        turtle.turnRight();
        assertSame(NORTH,turtle.getCurrentDirection());
        turtle.writeOn(sketchPad,5);
        sketchPad.getFloor();
        counter = 0;
        while (counter < numberOfSteps) {
            assertEquals(1,floor[counter][0]);
            counter++;

        }
        assertEquals(new Position(0,0),turtle.getCurrentPosition());

        }
    }




