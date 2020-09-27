package hackerrank.algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 9/25/20 6:13 PM
 */

class MissingNumbersTest {

  MissingNumbers missingNumbers = new MissingNumbers();

  @Test
  void testMissingNumbers1() {
    int[] arr = {7, 2, 5, 3, 5, 3};
    int[] brr = {7, 2, 5, 4, 6, 3, 5, 3};

    int[] result = {4, 6};
    assertArrayEquals(result, missingNumbers.missingNumbers(arr, brr));
  }

  @Test
  void testMissingNumbers2() {
    int[] arr = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
    int[] brr = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

    int[] result = {204, 205, 206};
    assertArrayEquals(result, missingNumbers.missingNumbers(arr, brr));
  }

  @Test
  void testMissingNumbers3() {
    int[] arr = {11, 4, 11, 7, 13, 4, 12, 11, 10, 14};
    int[] brr = {11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12};

    int[] result = {3, 7, 8, 10, 12};
    assertArrayEquals(result, missingNumbers.missingNumbers(arr, brr));
  }

}