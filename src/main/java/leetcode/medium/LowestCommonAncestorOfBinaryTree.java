package leetcode.medium;

import util.TreeNode;

/**
 * Created by nikoo28 on 12/19/17 12:55 AM
 */

class LowestCommonAncestorOfBinaryTree {

  TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q)
      return root;

    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if (left != null && right != null)
      return root;

    if (left != null)
      return left;
    else
      return right;
  }
}
