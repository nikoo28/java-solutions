package leetcode.easy;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {

  boolean isSameTree(TreeNode root1, TreeNode root2) {

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root1);
    queue.add(root2);

    // Loop till the queue is not empty
    while (!queue.isEmpty()) {
      TreeNode first = queue.poll();
      TreeNode second = queue.poll();

      // Check for equality
      if (first == null && second == null) {
        continue;
      } else if (
          first == null || second == null || first.val != second.val) {
        return false;
      }

      // Add other nodes
      queue.add(first.left);
      queue.add(second.left);
      queue.add(first.right);
      queue.add(second.right);
    }
    return true;
  }

}
