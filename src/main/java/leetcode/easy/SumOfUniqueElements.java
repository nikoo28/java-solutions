package leetcode.easy;

public class SumOfUniqueElements {

  int sumOfUnique(int[] nums) {

    // Create a frequency array to store the frequency
    int[] freq = new int[101];
    int sum = 0;

    for (int num : nums)
      freq[num]++;

    for (int i = 0; i < freq.length; i++) {
      if (freq[i] == 1) {
        sum += i;
      }
    }

    return sum;
  }

}
