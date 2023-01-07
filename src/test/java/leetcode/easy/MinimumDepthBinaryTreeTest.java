package leetcode.easy;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDepthBinaryTreeTest {

  private final MinimumDepthBinaryTree minimumDepthBinaryTree;

  MinimumDepthBinaryTreeTest() {
    minimumDepthBinaryTree = new MinimumDepthBinaryTree();
  }

  @Test
  void testMinDepth1() {
    // Creating a tree that looks like
    //            3
    TreeNode root = new TreeNode(3);

    // Adding left and right child
    //            3
    //          /  \
    //        2     3
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    // Adding more children to nodes
    //            3
    //          /   \
    //        2      3
    //         \      \
    //          3      1
    root.left.right = new TreeNode(3);
    root.right.right = new TreeNode(1);

    assertEquals(3, minimumDepthBinaryTree.minDepth(root));
  }

  @Test
  void testMinDepth2() {
    // Creating a tree that looks like
    //            1
    TreeNode root = new TreeNode(1);

    // Adding left and right child
    //            1
    //          /  \
    //        9     2
    root.left = new TreeNode(9);
    root.right = new TreeNode(2);

    // Adding more child to right node
    //            1
    //          /   \
    //        9      2
    //             /  \
    //            8   7
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(7);

    assertEquals(2, minimumDepthBinaryTree.minDepth(root));
  }
}