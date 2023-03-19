package leetcode.medium;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SubtreeOfAnotherTreeTest {

  private final SubtreeOfAnotherTree subtreeOfAnotherTree;

  SubtreeOfAnotherTreeTest() {
    subtreeOfAnotherTree = new SubtreeOfAnotherTree();
  }

  @Test
  void testIsSubtree1() {
    TreeNode root = new TreeNode(12);
    TreeNode subRoot = new TreeNode(2);

    assertFalse(subtreeOfAnotherTree.isSubtree(root, subRoot));
  }

  @Test
  void testIsSubtree2() {
    // Creating a tree that looks like
    //            10
    TreeNode root = new TreeNode(10);

    // Adding left and right child
    //            10
    //          /   \
    //        5      15
    root.left = new TreeNode(5);
    root.right = new TreeNode(15);

    TreeNode leftNode = root.left;
    TreeNode rightNode = root.right;

    // Adding more child to left node
    //            10
    //          /   \
    //        5      15
    //      /  \
    //     3   7
    leftNode.left = new TreeNode(3);
    leftNode.right = new TreeNode(7);

    // Adding child to right node
    //            10
    //          /   \
    //        5     15
    //      /  \      \
    //     3   7      18
    rightNode.right = new TreeNode(18);

    //            10
    //          /   \
    //        5     15
    //      /  \      \
    //     3   7      18
    //               /
    //              16
    rightNode.right.left = new TreeNode(16);

    // Creating another tree that looks like
    //            5
    TreeNode subRoot = new TreeNode(5);

    // Adding left and right child
    //            5
    //          /   \
    //        3      7
    subRoot.left = new TreeNode(3);
    subRoot.right = new TreeNode(7);

    assertTrue(subtreeOfAnotherTree.isSubtree(root, subRoot));
  }
}