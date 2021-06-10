package Chapter7;

public class SevenSegmentMain {
    public static void main(String[] args) {
        SevenSegment sevenSegment = new SevenSegment();

        try {
            sevenSegment.collectValue("11100111");
            sevenSegment.collectValue("1100");
            sevenSegment.addToIncompleteBit("1100");

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid length value");
        } catch (IllegalArgumentException e){
            System.out.println("Illegal value");
        }
        sevenSegment.collectValue("00010001");
        sevenSegment.display();

        }
    }
