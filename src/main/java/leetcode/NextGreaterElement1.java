package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author nikoo28 on 9/16/17
 */
class NextGreaterElement1 {

  private int[] nextGreaterElement(int[] nums1, int[] nums2) {

    Map<Integer, Integer> numberNGE = new HashMap<>();
    Stack<Integer> numStack = new Stack<>();

    for (int i : nums2) {

      if (numStack.isEmpty()) {
        numStack.push(i);
        continue;
      }

      if (i < numStack.peek()) {
        numStack.push(i);
        continue;
      }

      int poppedElement = numStack.peek();
      while (poppedElement < i) {

        numberNGE.put(poppedElement, i);
        numStack.pop();
        if (numStack.isEmpty())
          break;
        poppedElement = numStack.peek();
      }

      numStack.push(i);
    }

    while (!numStack.isEmpty()) {
      numberNGE.put(numStack.pop(), -1);
    }

    int[] result = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      result[i] = numberNGE.get(nums1[i]);
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums1 = {4, 1, 2};
    int[] nums2 = {1, 3, 4, 2};
    NextGreaterElement1 nextGreaterElement1 = new NextGreaterElement1();
    for (int i : nextGreaterElement1.nextGreaterElement(nums1, nums2)) {
      System.out.println(i);
    }

  }
}