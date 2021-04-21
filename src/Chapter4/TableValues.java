package Chapter4;
public class TableValues {
    public static void main(String[] args) {
        //System.out.printf("%s%s%s%nN,10*N");
        System.out.printf("%s%9s%10s%10s%n", "N", "10*N", "100*N", "1000*N");
        for (int i = 1; i <= 5; i++) {

            for (int j = i *10; j <= i*10; j+=10) {

                for (int k = i*100; k <= i*100; k+=100) {

                    for (int l = i*1000; l <=i*1000 ; l+=1000) {



                System.out.printf("%d%8d%10d%10d%n",i,j,k,l);

                        }
                    }

        }
    }
}
}
