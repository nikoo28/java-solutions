package hackerrank.datastructures.linkedlists;

import util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 3/21/21 12:02 AM
 */

class ReverseALinkedListTest {

  private final ReverseALinkedList reverseALinkedList;

  public ReverseALinkedListTest() {
    reverseALinkedList = new ReverseALinkedList();
  }

  @Test
  void testReverse1() {
    ListNode head = new ListNode(4);
    head.next = new ListNode(8);
    head.next.next = new ListNode(15);
    head.next.next.next = new ListNode(16);

    ListNode reversedList = reverseALinkedList.reverseWithoutExtraSpace(head);

    assertEquals(16, reversedList.val);
    assertEquals(15, reversedList.next.val);
    assertEquals(8, reversedList.next.next.val);
    assertEquals(4, reversedList.next.next.next.val);
    assertNull(reversedList.next.next.next.next);
  }

  @Test
  void testReverse2() {
    ListNode head = new ListNode(5);
    head.next = new ListNode(2);
    head.next.next = new ListNode(4);
    head.next.next.next = new ListNode(3);

    ListNode reversedList = reverseALinkedList.reverseWithoutExtraSpace(head);

    assertEquals(3, reversedList.val);
    assertEquals(4, reversedList.next.val);
    assertEquals(2, reversedList.next.next.val);
    assertEquals(5, reversedList.next.next.next.val);
    assertNull(reversedList.next.next.next.next);
  }

  @Test
  void testReverse3() {
    ListNode head = new ListNode(4);
    head.next = new ListNode(8);
    head.next.next = new ListNode(15);
    head.next.next.next = new ListNode(16);

    ListNode reversedList = reverseALinkedList.reverseWithStack(head);

    assertEquals(16, reversedList.val);
    assertEquals(15, reversedList.next.val);
    assertEquals(8, reversedList.next.next.val);
    assertEquals(4, reversedList.next.next.next.val);
    assertNull(reversedList.next.next.next.next);
  }

}