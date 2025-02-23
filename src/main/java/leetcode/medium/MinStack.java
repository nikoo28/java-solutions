package leetcode.medium;

import java.util.Stack;

public class MinStack {

  Stack<Integer> stack;
  Stack<Integer> minStack;

  public MinStack() {
    stack = new Stack<>();
    minStack = new Stack<>();
  }

  public void push(int val) {
    stack.push(val);

    // If the minStack is empty or the new value is less than or equal to
    // the top of the minStack, push it onto the minStack
    if (minStack.isEmpty() || val <= minStack.peek()) {
      minStack.push(val);
    }
  }

  public void pop() {
    int poppedValue = stack.pop();

    // If the popped value is equal to the top of the minStack,
    // pop it from the minStack as well
    if (poppedValue == minStack.peek()) {
      minStack.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }
}
