package hackerrank.datastructures.linkedlists;

import util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

  private final RemoveDuplicates removeDuplicates;

  public RemoveDuplicatesTest() {
    removeDuplicates = new RemoveDuplicates();
  }

  @Test
  void testRemoveDuplicates1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(3);
    head.next.next.next.next.next = new ListNode(4);
    head.next.next.next.next.next.next = new ListNode(4);
    head.next.next.next.next.next.next.next = new ListNode(5);

    removeDuplicates.removeDuplicates(head);

    assertEquals(1, head.val);
    assertEquals(2, head.next.val);
    assertEquals(3, head.next.next.val);
    assertEquals(4, head.next.next.next.val);
    assertEquals(5, head.next.next.next.next.val);
    assertNull(head.next.next.next.next.next);
  }

  @Test
  void testRemoveDuplicates2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);

    removeDuplicates.removeDuplicates(head);

    assertEquals(1, head.val);
    assertNull(head.next);
  }

  @Test
  void testRemoveDuplicates3() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(1);

    removeDuplicates.removeDuplicates(head);

    assertEquals(1, head.val);
    assertNull(head.next);
  }

  @Test
  void testRemoveDuplicates4() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(3);

    removeDuplicates.removeDuplicates(head);

    assertEquals(1, head.val);
    assertEquals(2, head.next.val);
    assertEquals(3, head.next.next.val);
    assertNull(head.next.next.next);
  }
}