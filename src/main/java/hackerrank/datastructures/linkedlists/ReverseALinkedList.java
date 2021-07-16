package hackerrank.datastructures.linkedlists;

import util.ListNode;

import java.util.Stack;

/**
 * Created by nikoo28 on 3/21/21 12:00 AM
 */

public class ReverseALinkedList {

  ListNode reverseWithoutExtraSpace(ListNode head) {
    if (head == null) {
      return null;
    }

    if (head.next == null) {
      return head;
    }

    ListNode preNode = null;
    ListNode currNode = head;

    while (currNode != null) {
      ListNode nextNode = currNode.next;
      currNode.next = preNode;
      preNode = currNode;
      currNode = nextNode;
    }

    head = preNode;

    return head;
  }

  ListNode reverseWithStack(ListNode head) {

    Stack<Integer> valueStack = new Stack<>();
    while (head != null) {
      valueStack.push(head.val);
      head = head.next;
    }

    ListNode reversedList = new ListNode(Integer.MIN_VALUE);
    ListNode ptr = reversedList;

    while (!valueStack.isEmpty()) {
      ptr.next = new ListNode(valueStack.pop());
      ptr = ptr.next;
    }

    return reversedList.next;
  }

}
