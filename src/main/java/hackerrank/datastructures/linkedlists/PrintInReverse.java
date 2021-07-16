package hackerrank.datastructures.linkedlists;

import util.ListNode;

import java.util.Stack;

/**
 * Created by nikoo28 on 3/21/21 12:00 AM
 */

public class PrintInReverse {

  void reversePrintUsingStack(ListNode head) {

    Stack<Integer> valueStack = new Stack<>();

    // Add all the elements to the stack
    while (head != null) {
      valueStack.push(head.val);
      head = head.next;
    }

    // Actually print the elements
    while (!valueStack.isEmpty()) {
      System.out.println(valueStack.pop());
    }
  }

  void reversePrintUsingRecursion(ListNode head) {

    // Terminating condition
    if (head.next == null)
      return;

    // Recursive call
    reversePrintUsingRecursion(head.next);

    // Actually print the value
    System.out.println(head.val);
  }

}
