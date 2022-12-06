package leetcode.easy;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {

  TreeNode invertTreeRecursive(TreeNode root) {

    if (root == null)
      return null;

    TreeNode temp = root.right;
    root.right = root.left;
    root.left = temp;

    invertTree(root.left);
    invertTree(root.right);

    return root;
  }

  TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }

    final Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      final TreeNode node = queue.poll();

      // Swap nodes
      final TreeNode temp = node.left;
      node.left = node.right;
      node.right = temp;

      // Add left and right of this node to the queue
      if (node.left != null) queue.add(node.left);

      if (node.right != null) queue.add(node.right);
    }
    return root;
  }

}
