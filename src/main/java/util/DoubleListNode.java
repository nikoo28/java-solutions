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

  public void traverseFromBeginning(DoubleListNode node) {
    // Go to the start
    while (node.prev != null) {
      node = node.prev;
    }

    // Start printing the values now
    while (node != null) {
      System.out.println(node.val);

      // Move to next value
      node = node.next;
    }
  }

  public void traverseFromEnd(DoubleListNode node) {
    // Go to the end
    while (node.next != null) {
      node = node.next;
    }

    // Start printing the values now
    while (node != null) {
      System.out.println(node.val);

      // Move to previous value
      node = node.prev;
    }
  }

  public void insertAtBeginning(DoubleListNode node, int valueToInsert) {
    // Go to the start
    while (node.prev != null) {
      node = node.prev;
    }

    DoubleListNode temp = new DoubleListNode(valueToInsert);
    temp.next = node;
    node.prev = temp;
  }

  public void insertAtEnd(DoubleListNode node, int valueToInsert) {
    // Go to the end
    while (node.next != null) {
      node = node.next;
    }

    DoubleListNode temp = new DoubleListNode(valueToInsert);
    temp.prev = node;
    node.next = temp;
  }

  public void insertAtPosition(DoubleListNode node, int valueToInsert, int pos) {
    // Go to the start
    while (node.prev != null) {
      node = node.prev;
    }

    // Move ahead required number of places
    for (int i = 1; i < pos; i++) {
      node = node.next;
    }

    DoubleListNode temp = new DoubleListNode(valueToInsert);
    temp.prev = node;
    temp.next = node.next;
    node.next.prev = temp;
    node.next = temp;
  }

  public void deleteFromBeginning(DoubleListNode node) {
    // Go to the start
    while (node.prev != null) {
      node = node.prev;
    }

    DoubleListNode temp = node.next;
    node.next = null;
    temp.prev = null;
  }

  public void deleteFromEnd(DoubleListNode node) {
    // Go to the end
    while (node.next != null) {
      node = node.next;
    }

    DoubleListNode temp = node.prev;
    node.prev = null;
    temp.next = null;
  }

  public void deleteAtPosition(DoubleListNode node, int pos) {
    // Go to the start
    while (node.prev != null) {
      node = node.prev;
    }

    // Go to the position
    for (int i = 1; i < pos; i++) {
      node = node.next;
    }

    node.next.prev = node.prev;
    node.prev.next = node.next;
    node.next = null;
    node.prev = null;
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
