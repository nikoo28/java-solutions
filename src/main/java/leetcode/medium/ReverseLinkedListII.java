package leetcode.medium;

import util.ListNode;

public class ReverseLinkedListII {

  ListNode reverseBetween(ListNode head, int left, int right) {

    // create a dummy node to mark the head of this list
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    // make markers for currentNode and for the node before reversing
    ListNode leftPre = dummy;
    ListNode currNode = head;

    for (int i = 0; i < left - 1; i++) {
      leftPre = leftPre.next;
      currNode = currNode.next;
    }

    // make a marker to node where we start reversing
    ListNode subListHead = currNode;

    ListNode preNode = null;
    for (int i = 0; i <= right - left; i++) {
      ListNode nextNode = currNode.next;
      currNode.next = preNode;
      preNode = currNode;
      currNode = nextNode;
    }

    // Join the pieces
    leftPre.next = preNode;
    subListHead.next = currNode;

    return dummy.next;
  }

}
