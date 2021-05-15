package Chapter6;

public class PerfectNumber {
        public static int findPerfectNumber(int num) {
            int store = 0;
            for (int counter = 1; counter < num; counter++) {
                if(num % counter == 0)
             store+= counter;
            }
            if(num == store){
                System.out.println(store +" "+"is a perfect number");
            }
            return store;
        }
        public  static  int findFirstHundredPerfectNumbers(){
            int perfectNumbers = 0;
            for (int counter = 1; counter <=10000 ; counter++) {
                 perfectNumbers = findPerfectNumber(counter);
            }
            return perfectNumbers;
        }



    public static void main(String[] args) {

        System.out.println(findPerfectNumber(100));
        System.out.println(findFirstHundredPerfectNumbers());

    }
}

