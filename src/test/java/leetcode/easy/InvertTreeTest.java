package leetcode.easy;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class InvertTreeTest {

  private final InvertTree invertTree;
  private final SameTree sameTree;

  InvertTreeTest() {
    invertTree = new InvertTree();
    sameTree = new SameTree();
  }

  @Test
  void testInvertTree1() {
    // Creating a tree like
    //            2
    //          /  \
    //        1     3
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);

    // Expecting a tree like
    //            2
    //          /  \
    //        3     1
    TreeNode expected = new TreeNode(2);
    expected.left = new TreeNode(3);
    expected.right = new TreeNode(1);

    TreeNode inverted = invertTree.invertTree(root);
    assertTrue(sameTree.isSameTree(expected, inverted));
  }

  @Test
  void testInvertTreeRecursive1() {
    // Creating a tree like
    //            2
    //          /  \
    //        1     3
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);

    // Expecting a tree like
    //            2
    //          /  \
    //        3     1
    TreeNode expected = new TreeNode(2);
    expected.left = new TreeNode(3);
    expected.right = new TreeNode(1);

    TreeNode invertedRecursive = invertTree.invertTreeRecursive(root);
    assertTrue(sameTree.isSameTree(expected, invertedRecursive));
  }

  @Test
  void testInvertTree2() {
    // Creating a tree like
    //            2
    TreeNode root = new TreeNode(2);

    // Expecting a tree like
    //            2
    TreeNode expected = new TreeNode(2);

    TreeNode inverted = invertTree.invertTree(root);
    assertTrue(sameTree.isSameTree(expected, inverted));
  }

  @Test
  void testInvertTreeRecursive2() {
    // Creating a tree like
    //            2
    TreeNode root = new TreeNode(2);

    // Expecting a tree like
    //            2
    TreeNode expected = new TreeNode(2);

    TreeNode invertedRecursive = invertTree.invertTreeRecursive(root);
    assertTrue(sameTree.isSameTree(expected, invertedRecursive));
  }

  @Test
  void testInvertTree3() {
    // Creating a tree like
    //             1
    //          /     \
    //        9         2
    //      /   \     /  \
    //     4    5    8   7
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(7);

    // Expecting a tree like
    //             1
    //          /     \
    //        2         9
    //      /   \     /  \
    //     7    8    5   4
    TreeNode expected = new TreeNode(1);
    expected.left = new TreeNode(2);
    expected.left.left = new TreeNode(7);
    expected.left.right = new TreeNode(8);
    expected.right = new TreeNode(9);
    expected.right.left = new TreeNode(5);
    expected.right.right = new TreeNode(4);

    TreeNode inverted = invertTree.invertTree(root);
    assertTrue(sameTree.isSameTree(expected, inverted));
  }

  @Test
  void testInvertTreeRecursive3() {
    // Creating a tree like
    //             1
    //          /     \
    //        9         2
    //      /   \     /  \
    //     4    5    8   7
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(7);

    // Expecting a tree like
    //             1
    //          /     \
    //        2         9
    //      /   \     /  \
    //     7    8    5   4
    TreeNode expected = new TreeNode(1);
    expected.left = new TreeNode(2);
    expected.left.left = new TreeNode(7);
    expected.left.right = new TreeNode(8);
    expected.right = new TreeNode(9);
    expected.right.left = new TreeNode(5);
    expected.right.right = new TreeNode(4);

    TreeNode inverted = invertTree.invertTreeRecursive(root);
    assertTrue(sameTree.isSameTree(expected, inverted));
  }

}