package leetcode;

import util.TreeNode;

/**
 * @author nikoo28 on 9/16/17
 */

class TrimABinarySearchTree {

  private TreeNode trimBST(TreeNode root, int L, int R) {

    if (root == null)
      return null;

    if (root.val < L)
      return trimBST(root.right, L, R);

    if (root.val > R)
      return trimBST(root.left, L, R);

    root.left = trimBST(root.left, L, R);
    root.right = trimBST(root.right, L, R);

    return root;
  }

}
