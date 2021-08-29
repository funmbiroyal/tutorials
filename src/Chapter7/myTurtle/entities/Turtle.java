package Chapter7.myTurtle.entities;

public class Turtle {
    private final Pen pen;
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle(Pen pen) {
        this.pen = pen;
        currentDirection = Direction.EAST;
        currentPosition = new Position(0, 0);


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

    public Pen getPen() {

        return pen;
    }

    public void movePenUp() {
        pen.setPenUp(true);
    }

    public boolean isPenUp() {
        return pen.isUp();
    }

    public void movePenDown() {
        pen.setPenDown(false);
    }

    public void turnRight() {
        if (currentDirection == Direction.EAST) {
            currentDirection = Direction.SOUTH;
        } else if (currentDirection == Direction.SOUTH) {
            currentDirection = Direction.WEST;
        } else if (currentDirection == Direction.WEST) {
            currentDirection = Direction.NORTH;
        }
    }

    public void moveForwardBy(int numberOfSteps) {
        numberOfSteps =numberOfSteps-1;
        if (currentDirection == Direction.EAST) {
            currentPosition.increaseColumnPositionBy(numberOfSteps);
        } else if (currentDirection == Direction.SOUTH) {
            currentPosition.increaseRowPositionBy(numberOfSteps);
        } else if (currentDirection == Direction.WEST) {
            currentPosition.decreaseColumnPositionBy(numberOfSteps);
        } else if (currentDirection == Direction.NORTH) {
            currentPosition.decreaseRowPositionBy(numberOfSteps);
        }
    }
}
