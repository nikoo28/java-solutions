package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

  private final CoinChange coinChange;

  CoinChangeTest() {
    coinChange = new CoinChange();
  }

  @Test
  void testCoinChange1() {
    int[] coins = {1, 2, 5};
    int amount = 11;

    assertEquals(3, coinChange.coinChange(coins, amount));
  }

  @Test
  void testCoinChange2() {
    int[] coins = {2};
    int amount = 3;

    assertEquals(-1, coinChange.coinChange(coins, amount));
  }

  @Test
  void testCoinChange3() {
    int[] coins = {1};
    int amount = 0;

    assertEquals(0, coinChange.coinChange(coins, amount));
  }
}