package leetcode.medium;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListIITest {

  private final ReverseLinkedListII reverseLinkedListII;

  ReverseLinkedListIITest() {
    reverseLinkedListII = new ReverseLinkedListII();
  }

  @Test
  void testReverseBetween1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ListNode reversed = reverseLinkedListII.reverseBetween(head, 2, 4);

    assertEquals(1, reversed.val);
    assertEquals(4, reversed.next.val);
    assertEquals(3, reversed.next.next.val);
    assertEquals(2, reversed.next.next.next.val);
    assertEquals(5, reversed.next.next.next.next.val);
  }

  @Test
  void testReverseBetween2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ListNode reversed = reverseLinkedListII.reverseBetween(head, 2, 2);

    assertEquals(1, reversed.val);
    assertEquals(2, reversed.next.val);
    assertEquals(3, reversed.next.next.val);
    assertEquals(4, reversed.next.next.next.val);
    assertEquals(5, reversed.next.next.next.next.val);
  }

  @Test
  void testReverseBetween3() {
    ListNode head = new ListNode(1);

    ListNode reversed = reverseLinkedListII.reverseBetween(head, 1, 1);

    assertEquals(1, reversed.val);
  }
}