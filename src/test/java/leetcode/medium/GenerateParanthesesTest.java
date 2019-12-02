package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/3/19 1:25 AM
 */

class GenerateParanthesesTest {

  private GenerateParantheses generateParantheses = new GenerateParantheses();

  @Test
  void generateParenthesis() {

    String[] expected = {
        "((()))",
        "(()())",
        "(())()",
        "()(())",
        "()()()"
    };

    List<String> actual = generateParantheses.generateParenthesis(3);

    for (String s : expected) {
      assertTrue(actual.contains(s));
    }
  }
}