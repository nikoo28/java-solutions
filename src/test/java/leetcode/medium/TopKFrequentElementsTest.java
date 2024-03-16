package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

  private final TopKFrequentElements topKFrequentElements;

  TopKFrequentElementsTest() {
    topKFrequentElements = new TopKFrequentElements();
  }

  @Test
  void testTopKFrequent1() {
    int[] arr = {1, 1, 1, 2, 2, 3};
    int k = 2;

    int[] res = {1, 2};
    assertArrayEquals(res, topKFrequentElements.topKFrequent(arr, k));
  }

  @Test
  void testTopKFrequent2() {
    int[] arr = {1, 1, 2};
    int k = 1;

    int[] res = {1};
    assertArrayEquals(res, topKFrequentElements.topKFrequent(arr, k));
  }

  @Test
  void testTopKFrequent3() {
    int[] arr = {4, 1, -1, 2, -1, 2, 3};
    int k = 2;

    int[] res = {-1, 2};
    assertArrayEquals(res, topKFrequentElements.topKFrequent(arr, k));
  }

  @Test
  void testTopKFrequent4() {
    int[] arr = {1, 1, 1, 1, 2, 2, 3, 3, 4};
    int k = 2;

    int[] res = {1, 2, 3};
    assertArrayEquals(res, topKFrequentElements.topKFrequent(arr, k));
  }
}