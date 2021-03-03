public class TrueLoveSentToMe {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.print("On the " + i);

            switch (i) {
                case 1:
                    System.out.print("st ");
                    break;
                case 2:
                    System.out.print("nd ");
                    break;
                case 3:
                    System.out.print("rd ");
                    break;
                default:
                    System.out.print("th ");
                    break;
            }
            System.out.println("day of christmas my true love sent to me");

            switch (i) {
                case 12:
                    System.out.println("Twelve drummers drumming ");
                case 11:
                    System.out.println("Eleven pipers piping ");
                case 10:
                    System.out.println("Ten lords are leaping ");
                case 9:
                    System.out.println("Nine ladies dancing ");
                case 8:
                    System.out.println("Eight maids a milking ");
                case 7:
                    System.out.println("seven swans a swimming");
                case 6:
                    System.out.println("six geese a laying ");
                case 5:
                    System.out.println("Five Golden geese ");
                case 4:
                    System.out.println("Four calling birds ");
                case 3:
                    System.out.println("Three french hens, ");
                case 2:
                    System.out.println("two turtle doves, and ");
                default:
                    System.out.println("A partridge in a pear tree. \n");

            }

        }
    }
}