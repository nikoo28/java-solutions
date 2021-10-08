package leetcode;

import util.TreeNode;

/**
 * Created by nikoo28 on 12/17/17 3:24 PM
 */

class SumOfLeftLeaves {

  private int sumOfLeftLeaves(TreeNode root) {

    if (root == null)
      return 0;

    int sum = 0;
    if (root.left != null)
      if (root.left.left == null && root.left.right == null)
        sum += root.left.val;
      else
        sum += sumOfLeftLeaves(root.left);

    sum += sumOfLeftLeaves(root.right);

    return sum;
  }

}
