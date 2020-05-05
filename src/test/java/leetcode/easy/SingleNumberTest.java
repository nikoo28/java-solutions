package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

  SingleNumber singleNumber = new SingleNumber();

  @Test
  void singleNumber1() {
    int[] arr = {2, 2, 1};
    assertEquals(1, singleNumber.singleNumber(arr));
  }

  @Test
  void singleNumber2() {
    int[] arr = {4, 1, 2, 1, 2};
    assertEquals(4, singleNumber.singleNumber(arr));
  }
}