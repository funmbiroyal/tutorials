package Chapter7.myTurtle.entities;

public class Turtle {
    private final Pen pen;
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle(Pen pen){
     this.pen = pen;
        currentDirection = Direction.EAST;
        currentPosition = new Position(0,0);


    }


    public Pen getPen() {
        return pen;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }
}
