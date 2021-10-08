package leetcode;

import util.TreeNode;

/**
 * Created by nikoo28 on 9/23/18 11:07 PM
 */

class DiameterOfBinaryTree {

  private int ans;

  public int diameterOfBinaryTree(TreeNode root) {

    ans = 1;
    depth(root);
    return ans - 1;
  }

  private int depth(TreeNode root) {
    if (root == null)
      return 0;

    int left = depth(root.left);
    int right = depth(root.right);
    ans = Math.max(ans, left + right + 1);
    return Math.max(left, right) + 1;
  }

}
