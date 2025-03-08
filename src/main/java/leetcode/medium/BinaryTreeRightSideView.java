package leetcode.medium;

import util.TreeNode;

import java.util.*;

public class BinaryTreeRightSideView {

  List<Integer> rightSideView(TreeNode root) {

    List<Integer> result = new ArrayList<>();
    if (root == null) return result;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      int levelSize = queue.size();  // Number of nodes at the current level
      int lastValue = 0;  // Store the last node's value of the level

      for (int i = 0; i < levelSize; i++) {
        TreeNode node = queue.poll();
        lastValue = node.val;  // Update lastValue with the current node

        // Add child nodes to queue for next level processing
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
      }

      result.add(lastValue);  // Add the last node's value of this level
    }

    return result;
  }

}
