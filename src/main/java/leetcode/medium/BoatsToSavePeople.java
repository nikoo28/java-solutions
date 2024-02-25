package leetcode.medium;

import java.util.Arrays;

public class BoatsToSavePeople {

  int numRescueBoats(int[] people, int limit) {

    // Sort the people by weight
    Arrays.sort(people);

    int boats = 0;

    // Use 2 pointers to find the heaviest and lightest person
    int left = 0, right = people.length - 1;

    while (left <= right) {

      // If heaviest and lightest person can fit in same boat
      if (people[left] + people[right] <= limit) {
        left++;
      }

      // In any case, the heaviest person will be on the boat
      right--;

      // Increment the number of boats
      boats++;
    }

    return boats;
  }

}
