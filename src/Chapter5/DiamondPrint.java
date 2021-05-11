package Chapter5;

public class DiamondPrint {
    public static void main(String[] args) {
//        int space = 9;
//        int asterisk = 1;
//        for (int i = 0; i < 4; i++) {
//            for (int j = space; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int k = asterisk; k > 0; k--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//            space -= 2;
//            asterisk += 2;
//        }
//      /*int space2 = 9;
//        int asterisk2 =7;*/
//        for (int i = 0; i < 5 ; i++) {
//            for (int a = space; a >0 ; a--) {
//                System.out.print(" ");
//            }
//            for (int c = asterisk; c > 0 ; c--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//            space+=2;
//            asterisk-=2;
//
//        }
        int spaces = 9, star = 1, lines = 9;
        int div = lines / 2 + 1;
        for (int i = 1; i <= lines; i++) {
            for (int s = spaces; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = star; j > 0; j--) {
                System.out.print("* ");
            }
            if (i < div) {
                System.out.println();
                star += 2;
                spaces -= 2;
            }
            else if(i >=div){
                System.out.println();
                star-=2;
                spaces+=2;
            }

        }
    }
}