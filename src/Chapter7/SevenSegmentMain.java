package Chapter7;

public class SevenSegmentMain {
    public static void main(String[] args) {
        SevenSegment sevenSegment = new SevenSegment();

        try {
            sevenSegment.collectValue("24");
            sevenSegment.display();

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid length value");
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal value");
        }


    }
}
