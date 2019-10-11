package leetcode.medium;

/**
 * Created by nikoo28 on 2019-08-10 19:51
 */

class NumberOfDiceRollsWIthTargetSum {

  private static final int MOD = (int) (Math.pow(10, 9) + 7);

  private int numRollsToTarget(int dices, int faces, int target) {

    long[][] dp = new long[dices + 1][target + 1];

    for (int j = 1; j <= faces && j <= target; j++)
      dp[1][j] = 1;

    for (int i = 2; i <= dices; i++) {
      for (int j = 1; j <= target; j++) {
        for (int k = 1; k < j && k <= faces; k++)
          dp[i][j] = (dp[i][j] + dp[i - 1][j - k]) % MOD;
      }
    }

    return (int) dp[dices][target] % MOD;
  }

  public static void main(String[] args) {

    NumberOfDiceRollsWIthTargetSum numberOfDiceRollsWIthTargetSum = new NumberOfDiceRollsWIthTargetSum();

    System.out.println(numberOfDiceRollsWIthTargetSum.numRollsToTarget(20, 19, 233));
    System.out.println(numberOfDiceRollsWIthTargetSum.numRollsToTarget(1, 6, 3));
    System.out.println(numberOfDiceRollsWIthTargetSum.numRollsToTarget(2, 6, 7));
    System.out.println(numberOfDiceRollsWIthTargetSum.numRollsToTarget(2, 5, 10));
    System.out.println(numberOfDiceRollsWIthTargetSum.numRollsToTarget(1, 2, 3));
    System.out.println(numberOfDiceRollsWIthTargetSum.numRollsToTarget(30, 30, 500));

  }

}
