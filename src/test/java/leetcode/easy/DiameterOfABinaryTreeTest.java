package leetcode.easy;

import util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 6/27/20 2:33 AM
 */

class DiameterOfABinaryTreeTest {

  DiameterOfABinaryTree diameterOfABinaryTree = new DiameterOfABinaryTree();

  @Test
  void testDiameterOfBinaryTree1() {

    //
    //       1
    //      / \
    //     2   3
    //    / \
    //   4   5
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);

    assertEquals(3, diameterOfABinaryTree.diameterOfBinaryTree(root));
  }

  @Test
  void testDiameterOfBinaryTree2() {

    //           1
    //         /   \
    //       4      3
    //     /  \      \
    //   2    5       8
    //      /        /
    //     6        7
    //            /  \
    //           0    9
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(4);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(5);
    root.left.right.left = new TreeNode(6);

    root.right = new TreeNode(3);
    root.right.right = new TreeNode(8);
    root.right.right.left = new TreeNode(7);
    root.right.right.left.left = new TreeNode(0);
    root.right.right.left.right = new TreeNode(9);

    assertEquals(7, diameterOfABinaryTree.diameterOfBinaryTree(root));
  }
}