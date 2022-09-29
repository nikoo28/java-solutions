package leetcode.medium;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberIIITest {

  private final HouseRobberIII houseRobberIII;

  HouseRobberIIITest() {
    houseRobberIII = new HouseRobberIII();
  }

  @Test
  void testRob1() {
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

    assertEquals(7, houseRobberIII.rob(root));
  }

  @Test
  void testRob2() {
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

    assertEquals(24, houseRobberIII.rob(root));
  }
}