package leetcode.easy;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class CountCompleteTreeNodesTest {

  private final CountCompleteTreeNodes countCompleteTreeNodes;

  CountCompleteTreeNodesTest() {
    countCompleteTreeNodes = new CountCompleteTreeNodes();
  }

  @Test
  void testCountNodes1() {
    TreeNode root = new TreeNode(1);

    assertEquals(1, countCompleteTreeNodes.countNodes(root));
  }

  @Test
  void testCountNodes2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);

    assertEquals(4, countCompleteTreeNodes.countNodes(root));
  }

  @Test
  void testCountNodes3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);

    assertEquals(6, countCompleteTreeNodes.countNodes(root));
  }

  @Test
  void testCountNodes4() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    assertEquals(3, countCompleteTreeNodes.countNodes(root));
  }
}