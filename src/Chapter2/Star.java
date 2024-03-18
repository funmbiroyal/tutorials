package Chapter2;

public class Star {
    public static void main(String[] args) {
        Star star = new Star();
        System.out.println(star.printRightStar());
        System.out.println(star.printLeftStar());
    }

    private String printLeftStar() {
   int row = 10;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        return "left Star";
    }

    public String printRightStar(){
        for (int i = 0; i < 10 ; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        return "Right star";
    }

}
