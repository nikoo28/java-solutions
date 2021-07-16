package util;

public class DoubleListNode {

  int val;
  DoubleListNode prev;
  DoubleListNode next;

  public DoubleListNode(int val) {
    this.val = val;
    prev = null;
    next = null;
  }

  public static void main(String[] args) {

    // Create 3 nodes
    DoubleListNode l1 = new DoubleListNode(4);
    DoubleListNode l2 = new DoubleListNode(8);
    DoubleListNode l3 = new DoubleListNode(15);

    // Link the nodes
    l1.next = l2;
    l2.prev = l1;

    l2.next = l3;
    l3.prev = l2;

    // Iterate from beginning
    DoubleListNode temp = l1;
    while (temp != null) {
      System.out.println(temp.val + " ,");
      temp = temp.next;
    }

    // Iterate from last
    temp = l3;
    while (temp != null) {
      System.out.println(temp.val + " ,");
      temp = temp.prev;
    }
  }
}
