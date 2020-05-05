package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellAStockIITest {

  BestTimeToBuyAndSellAStockII bestTimeToBuyAndSellAStockII = new BestTimeToBuyAndSellAStockII();

  @Test
  void maxProfit1() {
    int[] prices = {7, 1, 5, 3, 6, 4};
    assertEquals(7, bestTimeToBuyAndSellAStockII.maxProfit(prices));
  }

  @Test
  void maxProfit2() {
    int[] prices = {1, 2, 3, 4, 5};
    assertEquals(4, bestTimeToBuyAndSellAStockII.maxProfit(prices));
  }

  @Test
  void maxProfit3() {
    int[] prices = {7, 6, 4, 3, 1};
    assertEquals(0, bestTimeToBuyAndSellAStockII.maxProfit(prices));
  }
}