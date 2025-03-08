package leetcode.medium;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeRightSideViewTest {

  private final BinaryTreeRightSideView binaryTreeRightSideView;

  BinaryTreeRightSideViewTest() {
    binaryTreeRightSideView = new BinaryTreeRightSideView();
  }

  @Test
  void testRightSideView1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(4);

    assertEquals("[1, 3, 4]", binaryTreeRightSideView.rightSideView(root).toString());
  }

  @Test
  void testRightSideView2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(5);

    assertEquals("[1, 3, 5]", binaryTreeRightSideView.rightSideView(root).toString());
  }

  @Test
  void testRightSideView3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.right = new TreeNode(5);

    assertEquals("[1, 5, 4]", binaryTreeRightSideView.rightSideView(root).toString());
  }
}