package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

  @Test
  void testMinStack1() {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    assertEquals(-3, minStack.getMin());
    minStack.pop();
    assertEquals(0, minStack.top());
    assertEquals(-2, minStack.getMin());
  }

  @Test
  void testMinStack2() {
    MinStack minStack = new MinStack();
    minStack.push(-1);
    minStack.push(-2);
    minStack.push(-3);
    minStack.push(0);
    minStack.push(2);
    assertEquals(-3, minStack.getMin());
    assertEquals(2, minStack.top());
    minStack.pop();
    assertEquals(0, minStack.top());
    assertEquals(-3, minStack.getMin());
  }

}