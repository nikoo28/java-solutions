package leetcode;

import java.util.Stack;

/**
 * Created by nikoo28 on 7/19/19 2:36 AM
 */

class MinStack {

  private Stack<Integer> mStack = new Stack<>();
  private Stack<Integer> mMinStack = new Stack<>();

  public void push(int x) {
    mStack.push(x);
    if (mMinStack.size() != 0) {
      int min = mMinStack.peek();
      if (x <= min) {
        mMinStack.push(x);
      }
    } else {
      mMinStack.push(x);
    }
  }

  public void pop() {
    int x = mStack.pop();
    if (mMinStack.size() != 0) {
      if (x == mMinStack.peek()) {
        mMinStack.pop();
      }
    }
  }

  public int top() {
    return mStack.peek();
  }

  public int getMin() {
    return mMinStack.peek();
  }

}
