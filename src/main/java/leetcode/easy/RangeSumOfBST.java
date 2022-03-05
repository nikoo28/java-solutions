package leetcode.easy;

import util.TreeNode;

public class RangeSumOfBST {

  public int rangeSumBST(TreeNode root, int low, int high) {
    if (root == null)
      return 0;

    int sum = 0;

    // Explore the left sub-tree
    if (root.val > low)
      sum += rangeSumBST(root.left, low, high);

    // If value is in range add it to sum
    if (root.val >= low && root.val <= high)
      sum += root.val;

    // Explore the right sub-tree only if required
    if (root.val < high)
      sum += rangeSumBST(root.right, low, high);

    return sum;
  }
}
