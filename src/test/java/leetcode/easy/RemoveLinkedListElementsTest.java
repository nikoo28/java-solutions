package leetcode.easy;

import org.junit.jupiter.api.Test;
import util.ListNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElementsTest {

  private final RemoveLinkedListElements removeLinkedListElements;

  RemoveLinkedListElementsTest() {
    removeLinkedListElements = new RemoveLinkedListElements();
  }

  @Test
  void testRemoveElements1() {
    ListNode head = new ListNode(4);
    head.next = new ListNode(6);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(9);
    head.next.next.next.next.next = new ListNode(6);

    int val = 6;

    ListNode actual = removeLinkedListElements.removeElements(head, val);

    assertEquals(4, actual.val);
    assertEquals(1, actual.next.val);
    assertEquals(3, actual.next.next.val);
    assertEquals(9, actual.next.next.next.val);
  }

  @Test
  void testRemoveElements2() {
    ListNode head = new ListNode(7);
    head.next = new ListNode(7);
    head.next.next = new ListNode(7);
    head.next.next.next = new ListNode(7);

    int val = 7;

    ListNode actual = removeLinkedListElements.removeElements(head, val);

    assertNull(actual);
  }
}