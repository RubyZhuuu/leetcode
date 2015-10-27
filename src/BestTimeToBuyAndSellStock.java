/**
 * no. 121
 * Created by Ruby on 2015/10/27 13:40.
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction
 * (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 */

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices.length > 0 ? prices[0] : 0;

        for(int i = 1; i < prices.length; i ++) {
            maxProfit = prices[i] - min > maxProfit ? prices[i] - min : maxProfit;
            min = min > prices[i] ? prices[i] : min;
        }
        return maxProfit;
    }
}
