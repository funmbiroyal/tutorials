public class Xmas {

    public static void main(String[] args) {

        for (int num = 1; num <= 12; num++ ){
            System.out.print("On the " + num);

            switch (num){

                case 1:
                    System.out.println("st");
                    break;
                case 2:
                    System.out.println("nd");
                    break;
                case 3:
                    System.out.println("rd");
                    break;
                default:
                    System.out.println("th");
                    break;
            }
            System.out.println("day of christmas my true love sent to me");

            switch (num){
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
