package leetcode.medium;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {

  private final RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList;

  RemoveNthNodeFromEndOfListTest() {
    removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
  }

  @Test
  void testRemoveNthFromEnd1() {
    ListNode head = new ListNode(4);
    head.next = new ListNode(8);
    head.next.next = new ListNode(15);
    head.next.next.next = new ListNode(16);
    head.next.next.next.next = new ListNode(23);

    removeNthNodeFromEndOfList.removeNthFromEnd(head, 2);

    assertEquals(4, head.val);
    assertEquals(8, head.next.val);
    assertEquals(15, head.next.next.val);
    assertEquals(23, head.next.next.next.val);
    assertNull(head.next.next.next.next);
  }

  @Test
  void testRemoveNthFromEnd2() {
    ListNode head = new ListNode(4);
    head.next = new ListNode(8);

    removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);

    assertEquals(4, head.val);
    assertNull(head.next);
  }

  @Test
  void testRemoveNthFromEnd3() {
    ListNode head = new ListNode(4);

    assertNull(removeNthNodeFromEndOfList.removeNthFromEnd(head, 1));
  }

}