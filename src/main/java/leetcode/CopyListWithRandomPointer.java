package leetcode;

import java.util.HashMap;

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

public class CopyListWithRandomPointer {

  HashMap<Node, Node> visitedHash = new HashMap<>();

  public Node copyRandomList(Node head) {

    if (head == null) {
      return null;
    }

    if (this.visitedHash.containsKey(head)) {
      return this.visitedHash.get(head);
    }

    Node node = new Node(head.val, null, null);

    this.visitedHash.put(head, node);

    node.next = this.copyRandomList(head.next);
    node.random = this.copyRandomList(head.random);

    return node;
  }
}
