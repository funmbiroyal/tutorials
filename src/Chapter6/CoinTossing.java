package Chapter6;

import java.security.SecureRandom;

import static Chapter6.CoinState.HEAD;
import static Chapter6.CoinState.TAIL;

public class CoinTossing {
    private int numberOfTimesForHead;
    private int NumberOfTimesForTail;
    private CoinState currentCoinState;


    public int getNumberOfTimesForHead() {
        return numberOfTimesForHead;
    }

    public int getNumberOfTimesForTail() {
        return NumberOfTimesForTail;
    }

    public void flipCoin() {
        SecureRandom secureRandom = new SecureRandom();
        int generatedNumber = secureRandom.nextInt(2);
        if(generatedNumber == 1){
            currentCoinState = HEAD;
            numberOfTimesForHead++;
        }
        else {
            currentCoinState = TAIL;
            NumberOfTimesForTail++;
        }

    }

    public CoinState getCurrentCoinState() {

        return currentCoinState;
    }



    }

