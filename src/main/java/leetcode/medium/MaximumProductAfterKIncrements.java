package leetcode.medium;

import java.util.PriorityQueue;

public class MaximumProductAfterKIncrements {

  int maximumProduct(int[] nums, int k) {

    PriorityQueue<Integer> numPQ = new PriorityQueue<>();
    int mod = 1000000007;

    // Add all elements to priority queue
    for (int num : nums)
      numPQ.offer(num);

    for (int i = 0; i < k; i++) {
      // Get the minimum element and increment by 1
      int minElement = numPQ.remove();
      minElement++;

      // Add it back to the priority queue
      numPQ.offer(minElement);
    }

    // Find the product
    long result = 1;
    while (!numPQ.isEmpty()) {
      result *= numPQ.poll();
      result %= mod;
    }

    return (int) result;
  }

}
