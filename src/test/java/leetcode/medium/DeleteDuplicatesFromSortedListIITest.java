package leetcode.medium;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class DeleteDuplicatesFromSortedListIITest {

  private final DeleteDuplicatesFromSortedListII deleteDuplicatesFromSortedListII;

  DeleteDuplicatesFromSortedListIITest() {
    deleteDuplicatesFromSortedListII = new DeleteDuplicatesFromSortedListII();
  }

  @Test
  void testDeleteDuplicates1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(4);
    head.next.next.next.next.next = new ListNode(4);
    head.next.next.next.next.next.next = new ListNode(5);

    ListNode expected = new ListNode(1);
    expected.next = new ListNode(2);
    expected.next.next = new ListNode(5);

    ListNode result = deleteDuplicatesFromSortedListII.deleteDuplicates(head);
    while (expected != null) {
      assertEquals(expected.val, result.val);
      expected = expected.next;
      result = result.next;
    }
  }

  @Test
  void testDeleteDuplicates2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(3);

    ListNode expected = new ListNode(2);
    expected.next = new ListNode(3);

    ListNode result = deleteDuplicatesFromSortedListII.deleteDuplicates(head);
    while (expected != null) {
      assertEquals(expected.val, result.val);
      expected = expected.next;
      result = result.next;
    }
  }

  @Test
  void testDeleteDuplicates3() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(2);
    head.next.next.next.next.next = new ListNode(3);

    ListNode expected = new ListNode(3);

    ListNode result = deleteDuplicatesFromSortedListII.deleteDuplicates(head);
    while (expected != null) {
      assertEquals(expected.val, result.val);
      expected = expected.next;
      result = result.next;
    }
  }
}