package leetcode.medium;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MaximumBinaryTreeTest {

  private final MaximumBinaryTree maximumBinaryTree;

  MaximumBinaryTreeTest() {
    maximumBinaryTree = new MaximumBinaryTree();
  }

  @Test
  void testConstructMaximumBinaryTree1() {
    int[] nums = {3, 2, 1, 6, 0, 5};

    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(3);
    root.left.right = new TreeNode(2);
    root.left.right.right = new TreeNode(1);
    root.right = new TreeNode(5);
    root.right.left = new TreeNode(0);

    TreeNode actual = maximumBinaryTree.constructMaximumBinaryTree(nums);

    assertEquals(root.val, actual.val);
    assertEquals(root.left.val, actual.left.val);
    assertEquals(root.left.right.val, actual.left.right.val);
    assertEquals(root.left.right.right.val, actual.left.right.right.val);
    assertEquals(root.right.val, actual.right.val);
    assertEquals(root.right.left.val, actual.right.left.val);
    assertNull(actual.left.right.right.left);
    assertNull(actual.left.right.right.right);
  }
}