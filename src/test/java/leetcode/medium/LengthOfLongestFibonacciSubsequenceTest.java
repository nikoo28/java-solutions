package leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LengthOfLongestFibonacciSubsequenceTest {
  private final LengthOfLongestFibonacciSubsequence lengthOfLongestFibSeq;

  LengthOfLongestFibonacciSubsequenceTest() {
    lengthOfLongestFibSeq = new LengthOfLongestFibonacciSubsequence();
  }

  @Test
  void lenOfLongestFibSeq1() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

    assertEquals(5, lengthOfLongestFibSeq.lengthOfLongestFibonacciSubsequence(arr));
  }

  @Test
  void lenOfLongestFibSeq2() {
    int[] arr = {1, 3, 7, 11, 12, 14, 18};

    assertEquals(3, lengthOfLongestFibSeq.lengthOfLongestFibonacciSubsequence(arr));
  }

  @Test
  void lenOfLongestFibSeq3() {
    int[] arr = {3, 4, 5, 6, 7, 8};

    assertEquals(3, lengthOfLongestFibSeq.lengthOfLongestFibonacciSubsequence(arr));
  }
}
