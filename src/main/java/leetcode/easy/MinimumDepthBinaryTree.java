package leetcode.easy;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthBinaryTree {

  int minDepth(TreeNode root) {
    if (root == null)
      return 0;

    int depth = 1;
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.offer(root);

    // Level order traversal
    while (!q.isEmpty()) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = q.poll();

        // If a leaf node is found just return depth
        if (node.left == null && node.right == null) {
          return depth;
        }
        if (node.left != null) {
          q.offer(node.left);
        }
        if (node.right != null) {
          q.offer(node.right);
        }
      }
      depth++;
    }
    return depth;
  }

}
