package leetcode.medium;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeFromPreorderInOrderTraversalTest {

  private final BinaryTreeFromPreorderInOrderTraversal binaryTreeFromPreorderInOrderTraversal;

  BinaryTreeFromPreorderInOrderTraversalTest() {
    binaryTreeFromPreorderInOrderTraversal = new BinaryTreeFromPreorderInOrderTraversal();
  }

  @Test
  void testBuildTree1() {
    int[] preOrder = {8, 2, 7, 1, 9, 3, 6};
    int[] inOrder = {7, 2, 1, 8, 3, 9, 6};

    TreeNode result = binaryTreeFromPreorderInOrderTraversal.buildTree(preOrder, inOrder);

    assertEquals(8, result.val);
    assertEquals(2, result.left.val);
    assertEquals(7, result.left.left.val);
    assertEquals(1, result.left.right.val);
    assertEquals(9, result.right.val);
    assertEquals(3, result.right.left.val);
    assertEquals(6, result.right.right.val);
  }

  @Test
  void testBuildTree2() {
    int[] preOrder = {-1};
    int[] inOrder = {-1};

    TreeNode result = binaryTreeFromPreorderInOrderTraversal.buildTree(preOrder, inOrder);

    assertEquals(-1, result.val);
  }
}