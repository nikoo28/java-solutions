package leetcode.medium;

import util.Node;

public class CopyListWithRandomPointer {

  Node copyRandomList(Node head) {
    if (head == null) return null;

    Node curr = head; // Create new list w/ same values
    while (curr != null) {
      Node newNode = new Node(curr.val);
      newNode.next = curr.next;
      curr.next = newNode;
      curr = newNode.next;
    }

    curr = head; // Copy the random pointers
    while (curr != null) {
      if (curr.random != null)
        curr.next.random = curr.random.next;
      curr = curr.next.next;
    }

    curr = head; // Separate the two lists
    Node newHead = head.next;
    Node newCurr = newHead;
    while (curr != null) {
      curr.next = newCurr.next;
      curr = curr.next;
      if (curr != null) {
        newCurr.next = curr.next;
        newCurr = newCurr.next;
      }
    }

    return newHead;
  }

}
