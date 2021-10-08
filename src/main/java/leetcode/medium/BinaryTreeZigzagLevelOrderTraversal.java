package leetcode.medium;

import java.util.*;

import util.TreeNode;

/**
 * Created by nikoo28 on 2019-08-24 18:30
 */

class BinaryTreeZigzagLevelOrderTraversal {

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> zigzag = new ArrayList<>();

    if (root == null)
      return zigzag;

    queue.add(root);
    boolean flag = false;
    while (!queue.isEmpty()) {

      int size = queue.size();
      List<Integer> level = new ArrayList<>();
      Stack<Integer> reverseLevel = new Stack<>();
      for (int i = 0; i < size; i++) {

        TreeNode node = queue.poll();
        if (flag)
          reverseLevel.add(node.val);
        else
          level.add(node.val);

        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
      }
      flag = !flag;

      if (!reverseLevel.isEmpty()) {
        while (!reverseLevel.isEmpty()) {
          level.add(reverseLevel.pop());
        }
      }

      if (!level.isEmpty()) {
        zigzag.add(level);
      }
    }

    return zigzag;
  }

}
