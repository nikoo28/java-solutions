package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by nikoo28 on 10/8/19 1:25 AM
 */

class ReorderDataInLogFilesTest {

  private ReorderDataInLogFiles reorderDataInLogFiles = new ReorderDataInLogFiles();

  @Test
  void reorderLogFilesTest() {
    String[] input = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};

    String[] expectedOutput = {"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"};

    String[] actualValue = reorderDataInLogFiles.reorderLogFiles(input);

    Assertions.assertArrayEquals(expectedOutput, actualValue);
  }

}
