package leetcode.easy;

/**
 * Created by nikoo28 on 12/19/17 1:26 AM
 */

class BestTimeToBuyAndSellAStock {

  int maxProfit(int[] prices) {

    // at the beginning the minimum price is the first price
    int buy_price = prices[0];

    // at the beginning the minimum  profit is zero
    int profit = 0;

    for (int i = 1; i < prices.length; i++) {

      // if the current price is less update the buy_price
      if (prices[i] < buy_price) {
        buy_price = prices[i];
      }
      else {
        // else check if we can get a better profit
        int current_profit = prices[i] - buy_price;
        profit = Math.max(current_profit, profit);
      }
    }

    return profit;
  }

}
