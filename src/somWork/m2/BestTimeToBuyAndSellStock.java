package somWork.m2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStock {
    public int getMaxProfit(int []prices){
       int min = Integer.MAX_VALUE;
       int maxProfit = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            maxProfit = Math.max(maxProfit, price - min);
        }
       return maxProfit;
        }

    public int approach2(int []prices){
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j <prices.length; j++) {
                maxProfit = Math.max(maxProfit,prices[j]-prices[i]);

            }
        }
        return maxProfit;

        }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bestTime = new BestTimeToBuyAndSellStock();
        int [] prices = {5,4,3,5,7};
        System.out.printf("The maximum profit is %s",bestTime.getMaxProfit(prices));

    }
    @Test
    void getMaxProfit(){
        BestTimeToBuyAndSellStock bestTime = new BestTimeToBuyAndSellStock();
        int [] prices = {2,15,3,5,7};
        assertEquals(13,bestTime.getMaxProfit(prices));
        assertEquals(13,bestTime.approach2(prices));
    }
}
