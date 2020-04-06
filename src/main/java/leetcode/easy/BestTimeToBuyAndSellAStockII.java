package leetcode.easy;

/**
 * Created by nikoo28 on 12/17/17 2:58 PM
 */

class BestTimeToBuyAndSellAStockII {

  public int maxProfit(int[] prices) {

    if (prices.length < 2) return 0;

    int buyingPrice = prices[0];
    int profit = 0;

    for (int i = 1; i < prices.length; i++) {

      if (prices[i] < buyingPrice) {
        buyingPrice = prices[i];
        continue;
      }

      profit += prices[i] - buyingPrice;
      buyingPrice = prices[i];
    }

    return profit;
  }

}
