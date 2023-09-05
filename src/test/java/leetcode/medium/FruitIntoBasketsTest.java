package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitIntoBasketsTest {

  private final FruitIntoBaskets fruitIntoBaskets;

  FruitIntoBasketsTest() {
    fruitIntoBaskets = new FruitIntoBaskets();
  }

  @Test
  void testTotalFruit1() {
    int[] fruits = {0, 1, 1};
    assertEquals(3, fruitIntoBaskets.totalFruit(fruits));
  }

  @Test
  void testTotalFruit2() {
    int[] fruits = {0, 1, 2, 3};
    assertEquals(2, fruitIntoBaskets.totalFruit(fruits));
  }

  @Test
  void testTotalFruit3() {
    int[] fruits = {1, 2, 1, 1, 3, 4, 2, 2, 2, 2, 4};
    assertEquals(6, fruitIntoBaskets.totalFruit(fruits));
  }
}