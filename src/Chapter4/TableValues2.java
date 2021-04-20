package Chapter4;

public class TableValues2 {
    public static void main(String[] args) {
        System.out.printf("%s%8s%8s%8s%n","N","N*10","N*20" ,"N*30");
        for (int i = 1; i <=10 ; i++) {
            for (int j = i*10; j <=i*10 ; j+=10) {
                for (int k = i*20; k <=i*20 ; k+=20) {
                    for (int l = i*30; l <=i*30 ; l+=30) {

                        System.out.printf("%d%7d%8d%8d%n",i,j,k,l);

                    }
               }
           }
        }
   }
}