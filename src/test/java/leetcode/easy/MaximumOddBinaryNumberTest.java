package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumOddBinaryNumberTest {

  private final MaximumOddBinaryNumber maximumOddBinaryNumber;

  MaximumOddBinaryNumberTest() {
    maximumOddBinaryNumber = new MaximumOddBinaryNumber();
  }

  @Test
  void testMaximumOddBinaryNumber1() {
    String s = "11";
    assertEquals("11", maximumOddBinaryNumber.maximumOddBinaryNumber(s));
  }

  @Test
  void testMaximumOddBinaryNumber2() {
    String s = "1001";
    assertEquals("1001", maximumOddBinaryNumber.maximumOddBinaryNumber(s));
  }

  @Test
  void testMaximumOddBinaryNumber3() {
    String s = "1";
    assertEquals("1", maximumOddBinaryNumber.maximumOddBinaryNumber(s));
  }

  @Test
  void testMaximumOddBinaryNumber4() {
    String s = "01100011";
    assertEquals("11100001", maximumOddBinaryNumber.maximumOddBinaryNumber(s));
  }

  @Test
  void testMaximumOddBinaryNumber5() {
    String s = "100";
    assertEquals("001", maximumOddBinaryNumber.maximumOddBinaryNumber(s));
  }
}