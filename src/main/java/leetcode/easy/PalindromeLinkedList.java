package leetcode.easy;

import util.ListNode;

/**
 * Created by nikoo28 on 2019-07-20 22:26
 */

class PalindromeLinkedList {

  boolean isPalindrome(ListNode head) {

    // Find the middle
    ListNode fast = head, slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    if (fast != null) { // odd nodes: let right half smaller
      slow = slow.next;
    }

    // Reverse the second half
    slow = reverseList(slow);
    fast = head;

    // Start comparing one by one
    while (slow != null) {
      if (fast.val != slow.val)
        return false;

      fast = fast.next;
      slow = slow.next;
    }
    return true;
  }

  private ListNode reverseList(ListNode head) {
    ListNode prev = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }

}
