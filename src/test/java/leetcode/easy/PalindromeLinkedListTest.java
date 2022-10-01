package leetcode.easy;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

  private final PalindromeLinkedList palindromeLinkedList;

  PalindromeLinkedListTest() {
    palindromeLinkedList = new PalindromeLinkedList();
  }

  @Test
  void testIsPalindrome1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(1);

    assertTrue(palindromeLinkedList.isPalindrome(head));
  }

  @Test
  void testIsPalindrome2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);

    assertFalse(palindromeLinkedList.isPalindrome(head));
  }

  @Test
  void testIsPalindrome3() {
    ListNode head = new ListNode(42);

    assertTrue(palindromeLinkedList.isPalindrome(head));
  }

  @Test
  void testIsPalindrome4() {
    ListNode head = null;

    assertTrue(palindromeLinkedList.isPalindrome(head));
  }
}