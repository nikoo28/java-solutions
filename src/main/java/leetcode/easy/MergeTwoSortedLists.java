package leetcode.easy;

import util.ListNode;

/**
 * Created by nikoo28 on 6/15/20 10:23 PM
 */

public class MergeTwoSortedLists {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    // Create a sentinal/dummy node to start
    ListNode returnNode = new ListNode(Integer.MIN_VALUE);

    // Create a copy of this node to iterate while solving the problem
    ListNode headNode = returnNode;

    // Traverse till one of the list reaches the end
    while (l1 != null && l2 != null) {

      // Compare the 2 values of lists
      if (l1.val <= l2.val) {
        returnNode.next = l1;
        l1 = l1.next;
      } else {
        returnNode.next = l2;
        l2 = l2.next;
      }
      returnNode = returnNode.next;
    }

    // Append the remaining list
    if (l1 == null) {
      returnNode.next = l2;
    } else if (l2 == null) {
      returnNode.next = l1;
    }

    // return the next node to sentinal node
    return headNode.next;
  }

}
