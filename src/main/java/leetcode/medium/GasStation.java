package leetcode.medium;

public class GasStation {

  int canCompleteCircuit(int[] gas, int[] cost) {
    int totalGas = 0, totalCost = 0;

    // Calculate total gas and total cost
    for (int i = 0; i < gas.length; i++) {
      totalGas += gas[i];
      totalCost += cost[i];
    }

    // If total gas is less than total cost, return -1
    if (totalGas < totalCost) {
      return -1;
    }

    int currentGas = 0, startIndex = 0;
    // Iterate through the gas stations
    for (int i = 0; i < gas.length; i++) {
      currentGas += gas[i] - cost[i];

      // If current gas is negative, reset start index and current gas
      if (currentGas < 0) {
        startIndex = i + 1;
        currentGas = 0;
      }
    }

    // Return the starting index if a valid circuit exists
    return startIndex;
  }

}
