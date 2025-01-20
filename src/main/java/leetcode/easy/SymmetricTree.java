package leetcode.easy;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nikoo28 on 10/19/19 3:50 PM
 */

class SymmetricTree {

  // iterative method to determine if a binary tree is symmetric
  // using 2 queues
  boolean isSymmetric(TreeNode root) {

      if (root == null) return true;

      Queue<TreeNode> leftTree = new LinkedList<>();
      Queue<TreeNode> rightTree = new LinkedList<>();

      leftTree.add(root.left);
      rightTree.add(root.right);

      while (!leftTree.isEmpty() && !rightTree.isEmpty()) {

        TreeNode leftNode = leftTree.poll();
        TreeNode rightNode = rightTree.poll();

        if (leftNode == null && rightNode == null) continue;

        if (leftNode == null || rightNode == null) return false;

        if (leftNode.val != rightNode.val) return false;

        // Pushing order is very important
        leftTree.add(leftNode.left);
        leftTree.add(leftNode.right);
        rightTree.add(rightNode.right);
        rightTree.add(rightNode.left);
      }

      return true;
  }

}
