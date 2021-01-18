package util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 1/17/21 10:14 PM
 */

class BinarySearchTest {

  @Test
  void testLinearSearch1() {
    int[] arr = {7, 3, 9, 5, 4, 8, 0, 1};
    Arrays.sort(arr);

    int numberToSearch = 9;
    assertTrue(BinarySearch.binarySearch(arr, numberToSearch));

    numberToSearch = 10;
    assertFalse(BinarySearch.binarySearch(arr, numberToSearch));
  }

  @Test
  void testSortedLinearSearch1() {
    int[] arr = {7, 3, 9, 5, 4, 8, 0, 1, -1, -2, -6, -7, -3, -5, -99, -100, 9999, 34, 12, 5653, 1213, 6563};
    Arrays.sort(arr);

    int numberToSearch = 9;
    assertTrue(BinarySearch.binarySearch(arr, numberToSearch));

    numberToSearch = 10;
    assertFalse(BinarySearch.binarySearch(arr, numberToSearch));
  }

}