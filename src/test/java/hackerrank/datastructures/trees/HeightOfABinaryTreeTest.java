package hackerrank.datastructures.trees;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/19/21 8:52 PM
 */

class HeightOfABinaryTreeTest {

  private final HeightOfABinaryTree heightOfABinaryTree;

  HeightOfABinaryTreeTest() {
    heightOfABinaryTree = new HeightOfABinaryTree();
  }

  @Test
  void testHeight1() {
    // Creating a tree with just 1 node
    //              2
    //            /   \
    //         null   null
    TreeNode root = new TreeNode(2);

    assertEquals(0, heightOfABinaryTree.height(root));
  }

  @Test
  void testHeight2() {
    // Creating a tree like
    //              2
    //            /   \
    //           1    3
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);

    assertEquals(1, heightOfABinaryTree.height(root));
  }

  @Test
  void testHeight3() {
    // Creating a tree like
    //              2
    //            /   \
    //           1     3
    //          /    /  \
    //         4    8   0
    //                   \
    //                   9
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(0);
    root.right.right.right = new TreeNode(9);

    assertEquals(3, heightOfABinaryTree.height(root));
  }

}