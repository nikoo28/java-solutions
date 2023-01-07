package hackerrank.datastructures.trees;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class IsBinarySearchTreeTest {

  private final IsBinarySearchTree isBinarySearchTree;

  IsBinarySearchTreeTest() {
    isBinarySearchTree = new IsBinarySearchTree();
  }

  @Test
  void testCheckBST1() {
    // Creating a tree that looks like
    //            3
    TreeNode root = new TreeNode(3);

    // Adding left and right child
    //            3
    //          /  \
    //        2     3
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    assertFalse(isBinarySearchTree.checkBST(root));
  }

  @Test
  void testCheckBST2() {
    // Creating a tree that looks like
    //            3
    TreeNode root = new TreeNode(3);

    // Adding left and right child
    //            3
    //          /  \
    //        1     5
    root.left = new TreeNode(1);
    root.right = new TreeNode(5);

    // Adding more children to nodes
    //            3
    //          /   \
    //        1      5
    //         \      \
    //          2      6
    root.left.right = new TreeNode(2);
    root.right.right = new TreeNode(6);

    assertTrue(isBinarySearchTree.checkBST(root));
  }

  @Test
  void testCheckBST3() {
    // Creating a tree that looks like
    //            3
    TreeNode root = new TreeNode(3);

    // Adding left and right child
    //            3
    //          /  \
    //        2     5
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);

    // Adding more children to nodes
    //            3
    //          /   \
    //        2      5
    //         \      \
    //          1      6
    root.left.right = new TreeNode(1);
    root.right.right = new TreeNode(6);

    assertFalse(isBinarySearchTree.checkBST(root));
  }
}