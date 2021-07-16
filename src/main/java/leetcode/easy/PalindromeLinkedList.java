package leetcode.easy;

import util.ListNode;

/**
 * Created by nikoo28 on 2019-07-20 22:26
 */

class PalindromeLinkedList {

  private boolean isPalindrome(ListNode head) {

    if (head == null)
      return false;
    if (head.next == null)
      return true;

    ListNode headPtr = head;

    ListNode clone = new ListNode(head.val);
    ListNode clonePtr = clone;
    while (head.next != null) {
      head = head.next;
      clone.next = new ListNode(head.val);
      clone = clone.next;
    }
    clone.next = null;

    clonePtr = reverseList(clonePtr);

    while (headPtr != null) {

      if (headPtr.val != clonePtr.val)
        return false;

      headPtr = headPtr.next;
      clonePtr = clonePtr.next;
    }

    return true;
  }

  private ListNode reverseList(ListNode head) {

    if (head == null || head.next == null)
      return head;

    ListNode prev = null;

    while (head.next != null) {

      ListNode temp = head.next;
      head.next = prev;
      prev = head;
      head = temp;
    }

    head.next = prev;
    return head;

  }

  public static void main(String[] args) {
    PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);

    palindromeLinkedList.isPalindrome(head);
  }

}
