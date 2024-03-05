package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSquareNumbersTest {

  private final SumOfSquareNumbers sumOfSquareNumbers;

  SumOfSquareNumbersTest() {
    sumOfSquareNumbers = new SumOfSquareNumbers();
  }

  @Test
  void testJudgeSquareSum1() {
    assertTrue(sumOfSquareNumbers.judgeSquareSum(5));
  }

  @Test
  void testJudgeSquareSum2() {
    assertFalse(sumOfSquareNumbers.judgeSquareSum(3));
  }

  @Test
  void testJudgeSquareSum3() {
    assertTrue(sumOfSquareNumbers.judgeSquareSum(4));
  }

  @Test
  void testJudgeSquareSum4() {
    assertTrue(sumOfSquareNumbers.judgeSquareSum(2));
  }

  @Test
  void testJudgeSquareSum5() {
    assertTrue(sumOfSquareNumbers.judgeSquareSum(1));
  }

  @Test
  void testJudgeSquareSum6() {
    assertTrue(sumOfSquareNumbers.judgeSquareSum(0));
  }

  @Test
  void testJudgeSquareSum7() {
    assertFalse(sumOfSquareNumbers.judgeSquareSum(-1));
  }
}