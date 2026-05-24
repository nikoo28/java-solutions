package leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {

  private final Candy candy;

  CandyTest() {
    candy = new Candy();
  }

  @Test
  void testCandy1() {
    int[] ratings = {1, 0, 2};
    int result = candy.candy(ratings);
    assertEquals(5, result);
  }

  @Test
  void testCandy2() {
    int[] ratings = {1, 2, 2};
    int result = candy.candy(ratings);
    assertEquals(4, result);
  }
}