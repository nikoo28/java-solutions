package hackerrank.algorithms.strings;

/**
 * Created by nikoo28 on 8/25/20 9:51 PM
 */

public class TwoCharacters {

  public static final int NUM_LETTERS = 26;

  public int alternate(String str) {

    /* Edge case */
    if (str.length() <= 1) {
      System.out.println(0);
      return 0;
    }

    /* Create arrays representing the 26^2 subproblems */
    int[][] pair = new int[NUM_LETTERS][NUM_LETTERS];
    int[][] count = new int[NUM_LETTERS][NUM_LETTERS];

    for (int i = 0; i < str.length(); i++) {
      char letter = str.charAt(i);
      int letterNum = letter - 'a';

      /* Update row */
      for (int col = 0; col < NUM_LETTERS; col++) {
        if (pair[letterNum][col] == letter) {
          count[letterNum][col] = -1;
        }
        if (count[letterNum][col] != -1) {
          pair[letterNum][col] = letter;
          count[letterNum][col]++;
        }
      }

      /* Update column */
      for (int row = 0; row < NUM_LETTERS; row++) {
        if (pair[row][letterNum] == letter) {
          count[row][letterNum] = -1;
        }
        if (count[row][letterNum] != -1) {
          pair[row][letterNum] = letter;
          count[row][letterNum]++;
        }
      }
    }

    /* Find max in "count" array */
    int max = 0;
    for (int row = 0; row < NUM_LETTERS; row++) {
      for (int col = 0; col < NUM_LETTERS; col++) {
        max = Math.max(max, count[row][col]);
      }
    }
    return max;
  }

}
