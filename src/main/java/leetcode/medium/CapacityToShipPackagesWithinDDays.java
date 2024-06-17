package leetcode.medium;

public class CapacityToShipPackagesWithinDDays {

  int shipWithinDays(int[] weights, int D) {

    int minCap = 0;
    int maxCap = 0;
    for (int weight : weights) {

      minCap = Math.max(minCap, weight);
      maxCap += weight;
    }

    // Apply binary search
    while (minCap < maxCap) {
      int mid = minCap + (maxCap - minCap) / 2;

      // Try to ship with "mid" capacity
      int days = 1;
      int sum = 0;
      for (int weight : weights) {
        if (sum + weight > mid) {
          days++;
          sum = 0;
        }
        sum += weight;
      }

      // If more days are required, increase capacity
      if (days > D)
        minCap = mid + 1;
      else
        maxCap = mid;
    }

    return minCap;
  }

}
