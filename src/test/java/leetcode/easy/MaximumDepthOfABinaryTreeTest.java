package leetcode.easy;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfABinaryTreeTest {

  private final MaximumDepthOfABinaryTree maximumDepthOfABinaryTree;

  MaximumDepthOfABinaryTreeTest() {
    maximumDepthOfABinaryTree = new MaximumDepthOfABinaryTree();
  }

  @Test
  void testMaxDepth1() {
    // Creating a tree that looks like
    //            3
    TreeNode root = new TreeNode(3);

    // Adding left and right child
    //            3
    //          /  \
    //        2     3
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    // Adding more child to left node
    //            3
    //          /   \
    //        2      3
    //         \      \
    //          3      1
    root.left.right = new TreeNode(3);
    root.right.right = new TreeNode(1);

    assertEquals(3, maximumDepthOfABinaryTree.maxDepth(root));
  }
}