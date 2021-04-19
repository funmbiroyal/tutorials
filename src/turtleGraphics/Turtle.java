package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {

    private final Pen pen;
    //private Direction changeCurrentDirectionTo;
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle(Pen turtlePen) {
        this.pen = turtlePen;
        currentDirection = EAST;
        currentPosition = new Position(0,0);
    }

    public Pen getPen() {
        return pen;
    }

    public void movePenUp() {
        pen.setIsUp(true);
    }

    public boolean isPenUp() {
        return pen.isUp();
    }

    public void movePenDown() {
        pen.setIsDown(true);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST ->  currentDirection = SOUTH;
            case WEST -> currentDirection = NORTH;
            case SOUTH ->  currentDirection = WEST;
            case NORTH -> currentDirection = EAST;
        }
       
    }
    private void changeCurrentDirection(Direction newDirection){
        currentDirection = newDirection;
    }

    public void moveForwardBy(int numberOfSteps) {
        numberOfSteps = numberOfSteps-1;
        switch (currentDirection){
            case EAST -> currentPosition.increaseColumnPositionBy(numberOfSteps);
            case SOUTH -> currentPosition.increaseRowPositionBy(numberOfSteps);
            case WEST -> currentPosition.decreaseColumnPositionBy(numberOfSteps);
            case NORTH -> currentPosition.decreaseRowPositionBy(numberOfSteps);
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void writeOn(SketchPad sketchPad, int numberOfSteps) {
        if(!isPenUp()){
            int counter = 0;
            switch (currentDirection){

                case EAST :
                    while (counter<numberOfSteps){
                        var floor = sketchPad.getFloor();
                        int rowPosition= currentPosition.getRowPosition();
                        int columnPosition = currentPosition.getColumnPosition();
                        floor[rowPosition][columnPosition+counter]= 1;
                        counter++;
                    }

                    break;
                case SOUTH:
                    while(counter<numberOfSteps){
                        var floor= sketchPad.getFloor();
                        int rowPosition = currentPosition.getRowPosition();
                        int columnPosition = currentPosition.getColumnPosition();
                        floor[rowPosition+counter][columnPosition]=1;
                        counter++;
                    }
                    break;
                case WEST:
                    while(counter<numberOfSteps){
                        var floor= sketchPad.getFloor();
                        int rowPosition = currentPosition.getRowPosition();
                        int columnPosition = currentPosition.getColumnPosition();
                        floor[rowPosition][columnPosition-counter]=1;
                        counter++;
                    }
                    break;

                case NORTH:
                    while(counter<numberOfSteps){
                        var floor= sketchPad.getFloor();
                        int rowPosition = currentPosition.getRowPosition();
                        int columnPosition = currentPosition.getColumnPosition();
                        floor[rowPosition-counter][columnPosition]=1;
                        counter++;
                    }
                    break;
            }
        }
        moveForwardBy(numberOfSteps);
    }
}
