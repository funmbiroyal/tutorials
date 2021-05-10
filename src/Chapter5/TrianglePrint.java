package Chapter5;

public class TrianglePrint {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j < i; j++) {


                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        int star = 10;
        for (int k = 1; k <= 10; k++) {
            for (int l = star; l > 0; l--) {
                System.out.print("*");
            }
            System.out.println();
            star--;
        }

        System.out.println();


        int starss = 10;
        int space = 0;
        for (int a = 0; a < 10; a++) {
            for (int f = space; f > 0; f--) {
                System.out.print(" ");
            }
            space++;
            for (int i = starss; i > 0; i--) {
                System.out.print("*");
            }
            starss--;

            System.out.println();

        }

        System.out.println();
      int  stars = 0;
       int spaces = 10;
        for (int y = 0; y < 10; y++) {
            for (int r = spaces; r > 0; r--) {
                System.out.print(" ");
            }
            spaces--;

            for (int d = stars; d > 0; d--) {
                System.out.print("*");
            }
            stars++;
            System.out.println();

        }
    }

}
