package leetcode;

import util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author nikoo28 on 9/17/17
 */
class InvertBinaryTree {

  public TreeNode invertTree(TreeNode root) {

    if (root == null) {
      return null;
    }

    final Deque<TreeNode> stack = new LinkedList<>();
    stack.push(root);

    while (!stack.isEmpty()) {
      final TreeNode node = stack.pop();
      final TreeNode left = node.left;
      node.left = node.right;
      node.right = left;

      if (node.left != null) {
        stack.push(node.left);
      }
      if (node.right != null) {
        stack.push(node.right);
      }
    }
    return root;
  }

}
