package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {

  private final DailyTemperatures dailyTemperatures;

  DailyTemperaturesTest() {
    dailyTemperatures = new DailyTemperatures();
  }

  @Test
  void testDailyTemperatures1() {
    int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
    int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};

    int[] actual = dailyTemperatures.dailyTemperatures(temperatures);

    assertArrayEquals(expected, actual);
  }

  @Test
  void testDailyTemperatures2() {
    int[] temperatures = {30, 40, 50, 60};
    int[] expected = {1, 1, 1, 0};

    int[] actual = dailyTemperatures.dailyTemperatures(temperatures);

    assertArrayEquals(expected, actual);
  }

  @Test
  void testDailyTemperatures3() {
    int[] temperatures = {42, 23, 16, 15, 8, 4};
    int[] expected = {0, 0, 0, 0, 0, 0};

    int[] actual = dailyTemperatures.dailyTemperatures(temperatures);

    assertArrayEquals(expected, actual);
  }
}