package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nikoo28 on 7/16/19 2:15 AM
 */

class Node {
  public int val;
  public Node next;
  public Node random;

  public Node() {
  }

  public Node(int _val, Node _next, Node _random) {
    val = _val;
    next = _next;
    random = _random;
  }
}

class CopyListWithRandomPointer {

  private Map<Node, Node> oldNodeNewNodeMap = new HashMap<>();

  private Node copyRandomList(Node head) {

    if (head == null)
      return null;

    Node headCopy = head;
    while (head != null) {
      Node temp = new Node();
      oldNodeNewNodeMap.put(head, temp);

      temp.val = head.val;
      head = head.next;
    }

    head = headCopy;
    Node deepCopy = oldNodeNewNodeMap.get(head);
    Node deepCopyHead = deepCopy;
    while (head != null) {
      Node next = head.next;
      Node random = head.random;

      deepCopy.next = oldNodeNewNodeMap.get(next);
      deepCopy.random = oldNodeNewNodeMap.get(random);

      head = head.next;
      deepCopy = deepCopy.next;
    }

    return deepCopyHead;
  }

  public static void main(String[] args) {
    CopyListWithRandomPointer copyListWithRandomPointer = new CopyListWithRandomPointer();

    Node id1 = new Node();
    Node id2 = new Node();

    id1.val = 1;
    id2.val = 2;

    id1.next = id2;
    id1.random = id2;

    id2.next = null;
    id2.random = id2;

    System.out.println(copyListWithRandomPointer.copyRandomList(id1));
  }
}
