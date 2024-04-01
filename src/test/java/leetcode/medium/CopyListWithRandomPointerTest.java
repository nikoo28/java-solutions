package leetcode.medium;

import org.junit.jupiter.api.Test;
import util.Node;

import static org.junit.jupiter.api.Assertions.*;

class CopyListWithRandomPointerTest {

  private final CopyListWithRandomPointer copyListWithRandomPointer;

  CopyListWithRandomPointerTest() {
    copyListWithRandomPointer = new CopyListWithRandomPointer();
  }

  @Test
  void testCopyRandomList1() {
    // Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
    // Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
    // Explanation: The original linked list is [7,13,11,10,1].
    // The copied linked list is [7,13,11,10,1].
    // The random pointer of node 7 is null, so it is not set to any node.
    // The random pointer of node 13 is node 7, so it is set to node 7, and so on.
    Node head = new Node(7);
    head.next = new Node(13);
    head.next.next = new Node(11);
    head.next.next.next = new Node(10);
    head.next.next.next.next = new Node(1);
    head.random = null;
    head.next.random = head;
    head.next.next.random = head.next.next.next.next;
    head.next.next.next.random = head.next.next;
    head.next.next.next.next.random = head;
    Node result = copyListWithRandomPointer.copyRandomList(head);

    assertNotEquals(head, result);
    assertNotEquals(head.next, result.next);
    assertNotEquals(head.next.next, result.next.next);
    assertNotEquals(head.next.next.next, result.next.next.next);

    assertEquals(head.val, result.val);
    assertEquals(head.next.val, result.next.val);
    assertEquals(head.next.next.val, result.next.next.val);
    assertEquals(head.next.next.next.val, result.next.next.next.val);
  }

  @Test
  void testCopyRandomList2() {
    // Input: head = [[1,1],[2,1]]
    // Output: [[1,1],[2,1]]
    // Explanation: The original linked list is [1,2].
    // The copied linked list is [1,2].
    // The random pointer of node 1 is node 1, so it is set to node 1.
    // The random pointer of node 2 is node 1, so it is set to node 1.
    Node head = new Node(1);
    head.next = new Node(2);
    head.random = head;
    head.next.random = head;
    Node result = copyListWithRandomPointer.copyRandomList(head);

    assertNotEquals(head, result);
    assertNotEquals(head.next, result.next);

    assertEquals(head.val, result.val);
    assertEquals(head.next.val, result.next.val);
  }

  @Test
  void testCopyRandomList3() {
    // Input: head = [[3,null],[3,0],[3,null]]
    // Output: [[3,null],[3,0],[3,null]]
    // Explanation: The original linked list is [3,3,3].
    // The copied linked list is [3,3,3].
    // The random pointer of node 3 is null, so it is not set to any node.
    Node head = new Node(3);
    head.next = new Node(3);
    head.next.next = new Node(3);
    head.next.random = head;
    Node result = copyListWithRandomPointer.copyRandomList(head);

    assertNotEquals(head, result);
    assertNotEquals(head.next, result.next);
    assertNotEquals(head.next.next, result.next.next);

    assertEquals(head.val, result.val);
    assertEquals(head.next.val, result.next.val);
    assertEquals(head.next.next.val, result.next.next.val);
  }
}