package Chapter5;

public class ModifiedTriangle {
    public static void main(String[] args) {
        int star1 = 1, star2=10;
        int space1= 12, space2= 5;

        for (int i = 0; i <10 ; i++) {

            for (int j = 0; j <star1 ; j++) {
                System.out.print("*");
            }
            for (int k = space1; k > 0; k--) {
                System.out.print(" ");
                
            }
            for (int l = star2; l >0 ; l--) {
                System.out.print("*");

            }
            for (int m = space2; m >0; m--) {
                System.out.print(" ");
            }
            for (int iniPrint = 0; iniPrint < star2; iniPrint++){
                System.out.print("*");
            }
            for (int mo = space1; mo > 0 ; mo--){
                System.out.print(" ");
            }
            for (int lemeEnter = 0; lemeEnter < star1 ; lemeEnter++) {
                System.out.print("*");
            }
            star1++; space1--; star2--; space2+=2;
            System.out.println();
        }
    }
}
