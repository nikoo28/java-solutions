package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

  private final FibonacciNumber fibonacciNumber;

  FibonacciNumberTest() {
    fibonacciNumber = new FibonacciNumber();
  }

  @Test
  void testFib1() {
    int n = 2;
    assertEquals(1, fibonacciNumber.fib(n));
  }

  @Test
  void testFib2() {
    int n = 5;
    assertEquals(5, fibonacciNumber.fib(n));
  }

  @Test
  void testFib3() {
    int n = 10;
    assertEquals(55, fibonacciNumber.fib(n));
  }
}