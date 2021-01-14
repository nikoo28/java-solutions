package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 1/14/21 1:36 AM
 */

class RadixSortTest {

  RadixSort radixSort = new RadixSort();

  @Test
  void testRadixSort1() {
    int[] arr = {7, 3, 9, 5, 4, 8, 0, 1};
    int[] sortedArray = {0, 1, 3, 4, 5, 7, 8, 9};

    radixSort.radixSort(arr);
    assertArrayEquals(sortedArray, arr);
  }

  @Test
  void testRadixSort2() {
    int[] arr = {121, 432, 564, 23, 1, 45, 788};
    int[] sortedArray = {1, 23, 45, 121, 432, 564, 788};

    radixSort.radixSort(arr);
    assertArrayEquals(sortedArray, arr);
  }

  @Test
  void testRadixSort3() {
    int[] arr = {7, 3, 9, 5, 4, 8, 0, 1, -1, -2, -6, -7, -3, -5, -99, -100, 9999, 34, 12, 5653, 1213, 6563};
    int[] sortedArray = {-100, -99, -7, -6, -5, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 12, 34, 1213, 5653, 6563, 9999};

    radixSort.radixSort(arr);
    assertArrayEquals(sortedArray, arr);
  }

}