package array;

/**
 * no. 122
 * Created by Ruby on 2015/10/30 13:45.
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
 * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * Subscribe to see which companies asked this question
 */

public class BestTimeToSellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 1, j = 0; i < prices.length; j ++, i ++) {
            if(prices[i] - prices[j] > 0)
                profit += prices[i] - prices[j];
        }

        return profit;
    }
}
