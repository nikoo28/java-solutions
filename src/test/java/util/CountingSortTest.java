package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 12/26/20 8:54 PM
 */

class CountingSortTest {

  @Test
  void testCountingSort1() {
    int[] arr = {7, 3, 9, 5, 4, 8, 0, 1};
    int[] sortedArray = {0, 1, 3, 4, 5, 7, 8, 9};

    CountingSort.countingSort(arr);
    assertArrayEquals(sortedArray, arr);
  }

  @Test
  void testCountingSort2() {
    int[] arr = {7, 3, 9, 5, 4, 8, 0, 1, -1, -2, -6, -7, -3, -5, -99, -101, 98, 34, 12, 56, 13, 63};
    int[] sortedArray = {-101, -99, -7, -6, -5, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 12, 13, 34, 56, 63, 98};

    CountingSort.countingSort(arr);
    assertArrayEquals(sortedArray, arr);
  }

}