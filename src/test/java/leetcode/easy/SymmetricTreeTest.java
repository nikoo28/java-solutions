package leetcode.easy;

import util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/19/19 3:52 PM
 */

class SymmetricTreeTest {

  private SymmetricTree symmetricTree = new SymmetricTree();

  @Test
  void testIsSymmetric1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);

    assertTrue(symmetricTree.isSymmetric(root));
  }

  @Test
  void testIsSymmetric2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.right = new TreeNode(3);
    root.right.right = new TreeNode(3);

    assertFalse(symmetricTree.isSymmetric(root));
  }
}