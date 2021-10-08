package leetcode.medium;

import util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/3/19 2:00 AM
 */

class LowestCommonAncestorOfBinaryTreeTest {

  LowestCommonAncestorOfBinaryTree lowestCommonAncestorOfBinaryTree = new LowestCommonAncestorOfBinaryTree();

  @Test
  void lowestCommonAncestor() {

    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(4);

    root.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);

    assertEquals(3, lowestCommonAncestorOfBinaryTree.lowestCommonAncestor(root, root.left, root.right).val);
    assertEquals(5, lowestCommonAncestorOfBinaryTree.lowestCommonAncestor(root, root.left, root.left.right.right).val);
  }
}