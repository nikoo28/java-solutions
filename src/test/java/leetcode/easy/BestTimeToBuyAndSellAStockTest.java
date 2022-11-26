package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellAStockTest {

  private final BestTimeToBuyAndSellAStock bestTimeToBuyAndSellAStock;

  BestTimeToBuyAndSellAStockTest() {
    bestTimeToBuyAndSellAStock = new BestTimeToBuyAndSellAStock();
  }

  @Test
  void testMaxProfit1() {
    int[] prices = {7, 2, 4, 5, 1, 3, 6, 4};

    assertEquals(5, bestTimeToBuyAndSellAStock.maxProfit(prices));
  }

  @Test
  void testMaxProfit2() {
    int[] prices = {7, 1, 5, 3, 6, 4};

    assertEquals(5, bestTimeToBuyAndSellAStock.maxProfit(prices));
  }

  @Test
  void testMaxProfit3() {
    int[] prices = {7, 6, 4, 3, 1};

    assertEquals(0, bestTimeToBuyAndSellAStock.maxProfit(prices));
  }

  @Test
  void testMaxProfit4() {
    int[] prices = {2};

    assertEquals(0, bestTimeToBuyAndSellAStock.maxProfit(prices));
  }
}