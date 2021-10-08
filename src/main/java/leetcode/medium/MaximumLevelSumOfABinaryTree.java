package leetcode.medium;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nikoo28 on 2019-08-17 19:42
 */

class MaximumLevelSumOfABinaryTree {

  private int maxLevelSum(TreeNode root) {

    Queue<TreeNode> levelQueue = new LinkedList<>();
    int maxSum = 0;
    levelQueue.add(root);
    int levels = 0;
    int maxLevel = 0;
    while (!levelQueue.isEmpty()) {

      int c = levelQueue.size();
      int sum = 0;
      levels++;
      while (c > 0) {

        TreeNode temp = levelQueue.poll();
        sum += temp.val;
        if (temp.left != null) {
          levelQueue.add(temp.left);
        }
        if (temp.right != null) {
          levelQueue.add(temp.right);
        }
        c--;
      }
      if (sum > maxSum) {
        maxLevel = levels;
        maxSum = sum;
      }
    }
    return maxLevel;
  }

  public static void main(String[] args) {

    MaximumLevelSumOfABinaryTree maximumLevelSumOfABinaryTree = new MaximumLevelSumOfABinaryTree();

    TreeNode treeNode = new TreeNode(1);
    treeNode.left = new TreeNode(7);
    treeNode.right = new TreeNode(0);
    treeNode.left.left = new TreeNode(7);
    treeNode.left.right = new TreeNode(-8);
    treeNode.right.right = new TreeNode(2);

    System.out.println(maximumLevelSumOfABinaryTree.maxLevelSum(treeNode));

    treeNode = new TreeNode(989);
    treeNode.right = new TreeNode(10250);
    treeNode.right.left = new TreeNode(98693);
    treeNode.right.right = new TreeNode(-89388);
    treeNode.right.right.right = new TreeNode(-32127);

    System.out.println(maximumLevelSumOfABinaryTree.maxLevelSum(treeNode));
  }

}
