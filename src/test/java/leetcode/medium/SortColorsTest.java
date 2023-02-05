package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {

  private final SortColors sortColors;

  SortColorsTest() {
    sortColors = new SortColors();
  }

  @Test
  void testSortColors1() {
    int[] arr = {2, 0, 2, 1, 1, 0};
    int[] expected = {0, 0, 1, 1, 2, 2};

    sortColors.sortColors(arr);
    assertArrayEquals(expected, arr);
  }

  @Test
  void testSortColors2() {
    int[] arr = {2, 0, 2};
    int[] expected = {0, 2, 2};

    sortColors.sortColors(arr);
    assertArrayEquals(expected, arr);
  }

  @Test
  void testSortColors3() {
    int[] arr = {0};
    int[] expected = {0};

    sortColors.sortColors(arr);
    assertArrayEquals(expected, arr);
  }
}