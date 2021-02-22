package leetcode;

/**
 * Created by nikoo28 on 12/17/17 10:41 PM
 */

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }

  public static void main(String[] args) {

    // Create 3 nodes
    ListNode l1 = new ListNode(4);
    ListNode l2 = new ListNode(8);
    ListNode l3 = new ListNode(15);

    // Link the nodes
    l1.next = l2;
    l2.next = l3;
    l3.next = null;

    // Print values
    ListNode ptr = l1;
    while(ptr != null) {
      System.out.println(ptr.val);
      ptr = ptr.next;
    }
  }
}