public class DoWhileXmas {
    public static void main(String[] args) {
        int counter = 1;

        do {
            System.out.print("On the " + counter);

            switch(counter) {
                case 1:
                    System.out.print("st day ");
                    break;
                case 2:
                    System.out.print("nd day ");
                    break;
                case 3:
                    System.out.print("rd day ");
                    break;
                default:
                    System.out.print("th day ");
                    break;
            }
                System.out.println(" Of christmas  my true love sent to me ");

                switch (counter) {
                    case 12:
                        System.out.println("Twelve drummers drumming ");

                    case 11:
                        System.out.println("Eleven pipers piping ");

                    case 10:
                        System.out.println("Ten lords are leaping ");

                    case 9:
                        System.out.println("seven swans a swimming");

                    case 8:
                        System.out.println("Eight maids a milking ");

                    case 7:
                        System.out.println("seven swans a swimming");

                    case 6:
                        System.out.println("six geese a laying ");

                    case 5:
                        System.out.println("Five golden rings");
                    case 4:
                        System.out.println("Four calling birds");
                    case 3:
                        System.out.println("Three french hens ");
                    case 2:
                        System.out.println("Two turtle doves, and");
                    case 1:
                        System.out.println("A partridge in a pear tree ");
                        System.out.println();
                        break;


                }
                counter++;
            }
            while (counter <= 12) ;


            }
        }

