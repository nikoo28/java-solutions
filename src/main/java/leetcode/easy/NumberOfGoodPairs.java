package leetcode.easy;

public class NumberOfGoodPairs {

  public int numIdenticalPairs(int[] nums) {

    // Calculate the frequency of each number
    int[] count = new int[102];

    for (int num : nums) {
      count[num]++;
    }

    int totalCount = 0;

    // Calculate total number of pairs possible
    for (int i : count) {
      totalCount += ((i) * (i-1))/2;
    }

    return totalCount;
  }

}
