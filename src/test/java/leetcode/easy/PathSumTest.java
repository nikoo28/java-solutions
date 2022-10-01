package leetcode.easy;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {

  private final PathSum pathSum;

  PathSumTest() {
    pathSum = new PathSum();
  }

  @Test
  void testHasPathSum1() {
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

    assertTrue(pathSum.hasPathSum(root, 7));
    assertTrue(pathSum.hasPathSum(root, 8));
    assertFalse(pathSum.hasPathSum(root, 5));
    assertFalse(pathSum.hasPathSum(root, 6));
    assertFalse(pathSum.hasPathSum(root, 3));
  }

  @Test
  void testHasPathSum2() {
    // Creating a tree that looks like
    //            1
    TreeNode root = new TreeNode(1);

    // Adding left and right child
    //            1
    //          /  \
    //        9     2
    root.left = new TreeNode(9);
    root.right = new TreeNode(2);

    // Adding more child to left node
    //            1
    //          /   \
    //        9      2
    //       /     /  \
    //      3     8   7
    root.left.left = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(7);

    assertTrue(pathSum.hasPathSum(root, 13));
    assertTrue(pathSum.hasPathSum(root, 11));
    assertTrue(pathSum.hasPathSum(root, 10));
  }
}