package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

  private final ContainerWithMostWater containerWithMostWater;

  public ContainerWithMostWaterTest() {
    containerWithMostWater = new ContainerWithMostWater();
  }

  @Test
  void testMaxArea1() {
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    assertEquals(49, containerWithMostWater.maxArea(height));
  }

  @Test
  void testMaxArea2() {
    int[] height = {1, 1};

    assertEquals(1, containerWithMostWater.maxArea(height));
  }

  @Test
  void testMaxArea3() {
    int[] height = {4, 3, 2, 1, 4};

    assertEquals(16, containerWithMostWater.maxArea(height));
  }

  @Test
  void testMaxArea4() {
    int[] height = {1, 2, 1};

    assertEquals(2, containerWithMostWater.maxArea(height));
  }
}