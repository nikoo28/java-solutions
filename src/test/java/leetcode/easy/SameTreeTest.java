package leetcode.easy;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

  private final SameTree sameTree;

  SameTreeTest() {
    sameTree = new SameTree();
  }

  @Test
  void testIsSameTree1() {
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(3);

    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(2);
    root2.right = new TreeNode(3);

    assertTrue(sameTree.isSameTree(root1, root2));
  }

  @Test
  void testIsSameTree2() {
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);

    TreeNode root2 = new TreeNode(1);
    root2.right = new TreeNode(2);

    assertFalse(sameTree.isSameTree(root1, root2));
  }

  @Test
  void testIsSameTree3() {
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(1);

    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(1);
    root2.right = new TreeNode(2);

    assertFalse(sameTree.isSameTree(root1, root2));
  }
}