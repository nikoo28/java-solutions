package hackerrank.datastructures.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

  private final BalancedBrackets balancedBrackets;

  public BalancedBracketsTest() {
    balancedBrackets = new BalancedBrackets();
  }

  @Test
  void testIsBalanced1() {
    assertEquals("YES", balancedBrackets.isBalanced("{[()]}"));
    assertEquals("YES", balancedBrackets.isBalanced("{{[[(())]]}}"));
    assertEquals("YES", balancedBrackets.isBalanced("{(([])[])[]}[]"));
    assertEquals("NO", balancedBrackets.isBalanced("{[(])}"));
    assertEquals("NO", balancedBrackets.isBalanced("{"));
    assertEquals("NO", balancedBrackets.isBalanced("]"));
  }

  @Test
  void testIsBalancedMethod2() {
    assertEquals("YES", balancedBrackets.isBalancedConcise("{[()]}"));
    assertEquals("YES", balancedBrackets.isBalancedConcise("{{[[(())]]}}"));
    assertEquals("YES", balancedBrackets.isBalancedConcise("{(([])[])[]}[]"));
    assertEquals("NO", balancedBrackets.isBalancedConcise("{[(])}"));
    assertEquals("NO", balancedBrackets.isBalancedConcise("{"));
    assertEquals("NO", balancedBrackets.isBalancedConcise("]"));
  }
}