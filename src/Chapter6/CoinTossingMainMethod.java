package Chapter6;

public class CoinTossingMainMethod {
    public static void main(String[] args) {
        CoinTossing coinTossing = new CoinTossing();
        int chance = 10;
        for(int i = 0; i<10; i++){
            coinTossing.flipCoin();
        }

        System.out.println("Head appeared  " +" "+ coinTossing.getNumberOfTimesForHead() + " " + "times");
        System.out.println("Tail  appeared " +" "+ coinTossing.getNumberOfTimesForTail() + " " + "times");

    }
}
