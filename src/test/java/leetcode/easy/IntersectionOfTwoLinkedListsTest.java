package leetcode.easy;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 12/4/21 5:50 PM
 */

class IntersectionOfTwoLinkedListsTest {

  private final IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists;

  IntersectionOfTwoLinkedListsTest() {
    intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
  }

  @Test
  void testGetIntersectionNode1() {
    // Create list1
    //    4 -> 1 -> 8 -> 4 -> 5 -> null
    // head1  l2   l3   l4   l5
    ListNode head1 = new ListNode(4);
    ListNode l2 = new ListNode(1);
    head1.next = l2;
    ListNode l3 = new ListNode(8);
    l2.next = l3;
    ListNode l4 = new ListNode(4);
    l3.next = l4;
    ListNode l5 = new ListNode(5);
    l4.next = l5;
    l5.next = null;

    // Create list2
    //    5 -> 6 -> 1 -> null
    // head2   b1   b2
    ListNode head2 = new ListNode(5);
    ListNode b1 = new ListNode(6);
    head2.next = b1;
    ListNode b2 = new ListNode(1);
    b1.next = b2;

    // Set up intersection point
    //         head1    l2
    //            4  ->  1
    //                     \ l3     l4     l5
    //                       8  ->  4  ->  5  ->  null
    //                     /
    //     5  ->  6  ->  1
    //  head2    b1     b2
    b2.next = l3;

    assertEquals(l3, intersectionOfTwoLinkedLists.getIntersectionNodeSet(head1, head2));
    assertEquals(l3, intersectionOfTwoLinkedLists.getIntersectionNode(head1, head2));
  }
}