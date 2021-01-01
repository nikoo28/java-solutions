package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by nikoo28 on 1/1/21 1:27 AM
 */

class BucketSortTest {

  @Test
  void testBucketSort1() {
    int[] arr = {7, 3, 9, 5, 4, 8, 0, 1};
    int[] sortedArray = {0, 1, 3, 4, 5, 7, 8, 9};

    BucketSort.bucketSort(arr, 5);
    assertArrayEquals(sortedArray, arr);
  }

  @Test
  void testBucketSort2() {
    int[] arr = {7, 3, 9, 5, 4, 8, 0, 1, -1, -2, -6, -7, -3, -5, -99, -101, 98, 34, 12, 56, 13, 63};
    int[] sortedArray = {-101, -99, -7, -6, -5, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 12, 13, 34, 56, 63, 98};

    BucketSort.bucketSort(arr, 7);
    assertArrayEquals(sortedArray, arr);
  }

  @Test
  void testBucketSort3() {
    int[] arr = {-1, -2, -6, -7, -3, -5, -99, -101};
    int[] sortedArray = {-101, -99, -7, -6, -5, -3, -2, -1};

    BucketSort.bucketSort(arr, 4);
    assertArrayEquals(sortedArray, arr);
  }

}