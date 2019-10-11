package leetcode.medium;

/**
 * Created by nikoo28 on 2019-09-08 15:08
 */

class SubArraySumDivisibleByK {

  private int subarraysDivByK(int[] A, int K) {

    int subarrays = 0;
    int[] remainderGroups = new int[K];

    int prefixSum = 0;
    for (int value : A) {
      prefixSum += value;
      int group = prefixSum % K;
      if (group < 0)
        group += K;
      remainderGroups[group]++;
    }

    for (int remainderCount : remainderGroups) {
      if (remainderCount > 1)
        subarrays += (remainderCount * (remainderCount - 1)) / 2.0;
    }

    return subarrays + remainderGroups[0];
  }

  public static void main(String[] args) {

    int[] arr = {-1, 2, 9};
    SubArraySumDivisibleByK subArraySumDivisibleByK = new SubArraySumDivisibleByK();

    System.out.println(subArraySumDivisibleByK.subarraysDivByK(arr, 3));
  }

}
