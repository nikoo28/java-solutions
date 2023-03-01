package leetcode.medium;

import java.util.*;

import util.TreeNode;

/**
 * Created by nikoo28 on 2019-08-24 18:30
 */

class BinaryTreeZigzagLevelOrderTraversal {

  List<List<Integer>> zigzagLevelOrder(TreeNode root) {

    List<List<Integer>> zigzag = new ArrayList<>();
    if (root == null) return zigzag;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    boolean flag = false;

    while (!queue.isEmpty()) {

      int size = queue.size();
      List<Integer> level = new ArrayList<>();
      Stack<Integer> reverseStack = new Stack<>();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();

        // Check flag
        if (flag)
          reverseStack.add(node.val);
        else
          level.add(node.val);

        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
      }
      flag = !flag;

      // Pop all elements from stack
      while (!reverseStack.isEmpty())
        level.add(reverseStack.pop());

      zigzag.add(level);
    }

    return zigzag;
  }

}
